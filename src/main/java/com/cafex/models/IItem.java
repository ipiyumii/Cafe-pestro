
package com.cafex.models;

public interface IItem {
    String getItemName();
    double getItemUnitPrice();
    int getItemQuantity();
    void setItemQuantity(int qty);
    double getAmount();
}
