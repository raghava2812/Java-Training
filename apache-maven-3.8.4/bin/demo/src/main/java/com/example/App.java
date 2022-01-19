
package com.example;

// 1 Step import the package
// 2 Step Open the connection
// 3 Step Execute the Query
// 4 Step Process the results
// 5 Step (Data Process)
// 6 Step close the connection

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static String db_url = "jdbc:mysql://localhost/flipkart";
    private static String user = "root";
    private static String pass = "199812";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(db_url, user, pass);
        List<sample> ls = new ArrayList<sample>();


        ResultSet rs = con.createStatement()
                .executeQuery("select * from ORDERS");

        
        while (rs.next()) {
            ls.add(new sample(Integer.parseInt(rs.getString("ord_no")), Double.parseDouble(rs.getString("purch_amt")), rs.getString("ord_date"), Integer.parseInt(rs.getString("customer_id")), Integer.parseInt(rs.getString("salesman_id"))));
            // System.out.println(rs.getString("ord_no"));
            // System.out.println(rs.getString("purch_amt"));
            // System.out.println(rs.getString("ord_date"));
            // System.out.println(rs.getString("customer_id"));
            // System.out.println(rs.getString("salesman_id"));
        }
        ls.sort((a,b) -> {
            if(a.getOrd_no()<b.getOrd_no()){
                return -1;
            }
            return 0;
        } );

        ls.forEach(System.out::println);
        con.close();
    }
}