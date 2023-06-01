/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafex.db;

import com.cafex.models.IItem;
import com.cafex.models.IOrder;
import com.cafex.models.Item;
import com.cafex.models.Order;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author piyumiimalka
 */
public class DBUtil {
      private Connection connection;
    private PreparedStatement statement;
    
     public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_url = "jdbc:mysql://localhost:3306/Cafe_Pestro";
            String db_useR =  "root";
            String db_pwd= "root";
            
            this.connection = DriverManager.getConnection(db_url,db_useR,db_pwd);
            //Connection.close();
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
         }
         catch(SQLException ex){
            //JOptionPane.showMessageDialog(Dashboard.this, "Connection failed: " + ex.getMessage());
        }
    }
    
     public void insertItem(Item item) {
        String query = "INSERT INTO Cafe_Pestro.Orders\n" +
                        "(`Date`, Order_Id)\n" +
                        "VALUES(CURRENT_TIMESTAMP, 0);";
        try {
            statement = connection.prepareStatement(query, statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public void insertOrder() {
        String query = "INSERT INTO Cafe_Pestro.Orders\n" +
                        "(`Date`, Order_Id)\n" +
                        "VALUES(CURRENT_TIMESTAMP, 0);";
        try {
            statement = connection.prepareStatement(query, statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
     //insert orderItems
     //view orderItemView
     //getOrderItems
     
      public List<IItem> getAllItems() {
        List<IItem> items = new ArrayList<>();
        String query = "SELECT * FROM items";
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int itemId = resultSet.getInt("Id");
                String itemName = resultSet.getString("Item_name");
                double itemPrice = resultSet.getDouble("Price");
                Item item = new Item(itemId, itemName, itemPrice);
                items.add(item);
            }
             } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return items;
    }
      
      public List<IOrder> getOrdersList() {
        List<IOrder> orders = new ArrayList<>();
        String query = "SELECT * FROM items";
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int orderID = resultSet.getInt("Order_Id");
                Timestamp timestamp = resultSet.getTimestamp("timestamp_column");
                var date = new Date(timestamp.getTime());
                Order order = new Order(orderID, date);
                orders.add(order);
            }
             } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return orders;
    }
       
              
              

 public void close() {
        try {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
