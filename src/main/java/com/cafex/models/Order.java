
package com.cafex.models;

import com.cafex.Constants;
import java.util.Date;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Order implements IOrder{
    
    private int orderId;
    private Date date;
    private List<IItem> items;

    public Order(int orderId, Date date) {
        this.orderId = orderId;
        this.date = date;
    }

    public Order() {
    }
    
    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public double getGrossAmount() {
        double grossAmount = 0;
        
        for(IItem item : items){
            grossAmount += item.getAmount();
        }
        return grossAmount;    
    }

    @Override
    public double getTaxAmount() {
        return this.getGrossAmount() * Constants.TAX_PERCENTAGE;
    }

    @Override
    public double getNetAmount() {        
        
        return getGrossAmount() + getTaxAmount();
    }

    @Override
    public List<IItem> getItems() {
        return items;
    }

    public void setItems(List<IItem> items) {
        this.items = items;
    }


    
}
