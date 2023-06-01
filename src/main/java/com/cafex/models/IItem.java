/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cafex.models;

/**
 *
 * @author piyumiimalka
 */
public interface IItem {
    String getItemName();
    double getItemUnitPrice();
    int getItemQuantity();
    void setItemQuantity(int qty);
    double getAmount();
}
