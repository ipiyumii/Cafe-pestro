/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cafex.models;

import java.util.List;

/**
 *
 * @author piyumiimalka
 */
public interface IOrder {
    int getItemCount();
    double getGrossAmount();
    double getTaxAmount();
    double getNetAmount(); // Tax Deducted Value
    List<IItem> getItems();
}
