
package com.cafex.models;

import com.cafex.Constants;
import java.sql.Timestamp;
import java.util.Date;

public class OrderItem{
    
    public int orderID;
    public Date orderDate;
    public double grossAmount;
    public double taxAmount;
    public double netAmount;

    public OrderItem(int orderID, Date orderDate, double grossAmount, double taxAmount, double netAmount) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.grossAmount = grossAmount;
        this.taxAmount = taxAmount;
        this.netAmount = netAmount;
    }   
}
