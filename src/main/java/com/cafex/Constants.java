package com.cafex;

import com.cafex.db.DBUtil;
import com.cafex.models.IItem;
import java.util.ArrayList;
import java.util.List;

public class Constants {

    public static final float TAX_PERCENTAGE = 0.05f;

    public static List<IItem> itemList = new ArrayList<>();

    public static void Populate() {
        DBUtil dbUtil = new DBUtil();
        itemList = dbUtil.getAllItems();
        dbUtil.close();

    }
}
