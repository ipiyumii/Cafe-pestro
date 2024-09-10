
package com.cafex.models;

import java.util.List;

public interface IOrder {
    int getItemCount();
    double getGrossAmount();
    double getTaxAmount();
    double getNetAmount(); // Tax Deducted Value
    List<IItem> getItems();
}
