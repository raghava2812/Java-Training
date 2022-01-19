package com.example;

import java.sql.*;
import java.util.*;

public class fktcall {
    private static String url = "jdbc:mysql://localhost/flipkart";
    private static String user = "root";
    private static String password = "199812";
    public static void main(String[] args) throws SQLException {
        Connection set = DriverManager.getConnection(url, user, password);
        List<fktcust> lst = new ArrayList<fktcust>();

        // ResultSet rst = set.createStatement().executeQuery("SELECT * FROM CUSTOMER");
        ResultSet rst = set.createStatement().executeQuery("SELECT * FROM CUSTOMER");

        while(rst.next()){
            // lst.add(new sample(Integer.parseInt(rst.getString("ord_no")), Double.parseDouble(rst.getString("purch_amt")), rst.getString("ord_date"), Integer.parseInt(rst.getString("customer_id")), Integer.parseInt(rst.getString("salesman_id"))));
            lst.add(new fktcust(Integer.parseInt(rst.getString("customer_id")), rst.getString("cust_name"), rst.getString("city"), Integer.parseInt(rst.getString("grade")), Integer.parseInt(rst.getString("salesman_id"))));
        }
        System.out.println("Flipkart Customer Details :");
        lst.forEach(System.out::println);
        set.close();
    }
}