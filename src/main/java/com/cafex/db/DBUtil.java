
package com.cafex.db;

import com.cafex.models.IItem;
import com.cafex.models.IOrder;
import com.cafex.models.Item;
import com.cafex.models.Order;
import com.cafex.models.OrderItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBUtil {

    private Connection connection;
    private PreparedStatement statement;

    public DBUtil() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_url = "jdbc:mysql://localhost:3306/Cafe_Pestro";
            String db_useR = "root";
            String db_pwd = "root";

            this.connection = DriverManager.getConnection(db_url, db_useR, db_pwd);
            //Connection.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(Dashboard.this, "Connection failed: " + ex.getMessage());
        }
    }

    public void insertOrder(Double grossAmount, Double taxation, Double NetAmount) {
        String query = "INSERT INTO Orders\n"
                + "(`Date`,GrossAmount,Taxation,NetAmount)\n"
                + "VALUES(CURRENT_TIMESTAMP,?,?,?);";
        try {
            statement = connection.prepareStatement(query, statement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, grossAmount);
            statement.setDouble(2, taxation);
            statement.setDouble(3, NetAmount);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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

    public List<OrderItem> getOrdersList() {
        List<OrderItem> orders = new ArrayList<>();
        String query = "SELECT `Date`, Order_Id, GrossAmount, Taxation, NetAmount\n" +
                        "FROM Orders";
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int orderID = resultSet.getInt("Order_Id");
                Timestamp timestamp = resultSet.getTimestamp("Date");
                Double grossAmount = resultSet.getDouble("GrossAmount");
                Double taxation = resultSet.getDouble("Taxation");
                Double netAmount = resultSet.getDouble("NetAmount");

                var date = new Date(timestamp.getTime());
                OrderItem orderItem = new OrderItem(orderID, date, grossAmount, taxation, netAmount);
                orders.add(orderItem);
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
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

;
}
