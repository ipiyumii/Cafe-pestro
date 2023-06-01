package com.cafex;

import com.cafex.models.IItem;
import com.cafex.models.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author piyumiimalka
 */
public class Constants {
    public static final float TAX_PERCENTAGE = 0.05f;
    
    public static List<IItem> itemList = new ArrayList<>();
    
    public static  void Populate(){
        itemList.add(new Item("Burger",950));
        itemList.add(new Item("Submarine",950));
        itemList.add(new Item("Spicy Fry Kottu",700));
        itemList.add(new Item("Pasta",800));
        itemList.add(new Item("Biriyani",750));

    }
}
