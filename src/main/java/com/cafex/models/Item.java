
package com.cafex.models;

import com.cafex.Constants;

public class Item implements IItem{

    private int itemId;
    private String itemName;
    private double unitPrice;
    private int quantity;

    public Item(int itemId, String itemName, double unitPrice, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    } 

       public Item(int itemId, String itemName, double unitPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    } 

    public Item(String itemName, double unitPrice) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    }
    
    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public double getItemUnitPrice() {
        return unitPrice;
    }

    @Override
    public int getItemQuantity() {
        return quantity;
    }

    @Override
    public double getAmount() {
        return unitPrice * quantity;
    }

    @Override
    public void setItemQuantity(int qty) {
        this.quantity = qty;
    }

    
}
