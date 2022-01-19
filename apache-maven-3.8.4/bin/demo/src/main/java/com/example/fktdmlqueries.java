package com.example;

import java.sql.*;
public class fktdmlqueries {

    public static void main(String[] args) throws SQLException {
        Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost/flipkart", "root", "199812");
        Statement st = cntn.createStatement();

        // String query = "INSERT INTO CUSTOMER VALUES(3105,'HARI','NELLORE',400,5001)";
        // String query1 = "INSERT INTO CUSTOMER VALUES(3103,'NAVEEN','MENAKURU',200,5002)";
        // String query2 = "INSERT INTO CUSTOMER VALUES(3104,'BALAJI','NAIDUPETA',500,5003)";
        // st.execute(query);
        // st.execute(query1);
        // st.execute(query2);

        ResultSet rs = st.executeQuery("select * from CUSTOMER");

        while (rs.next()) {
            System.out.print("ID: " + rs.getInt("customer_id") + "\t");
            System.out.print("Name: " + rs.getString("cust_name") + "\t");
            System.out.print("City: " + rs.getString("city") + "\t");
            System.out.print("Grade: " + rs.getInt("grade") + "\t");
            System.out.print("Salesman ID: " + rs.getInt("salesman_id") + "\n");
        }

    }
}
