/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafex.models;

import com.cafex.Constants;
import java.util.Date;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author piyumiimalka
 */
public class Order implements IOrder{
    
    private int orderId;
    private Date date;
    private List<IItem> items;

    public Order(int orderId, Date date) {
        this.orderId = orderId;
        this.date = date;
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
        return this.getGrossAmount();
    }

    @Override
    public double getNetAmount() {        
        double netAmount = 0;
        
        return netAmount = getGrossAmount() + Constants.TAX_PERCENTAGE;
    }

    @Override
    public List<IItem> getItems() {
        return items;
    }


    
}
