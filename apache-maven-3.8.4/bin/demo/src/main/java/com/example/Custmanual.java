package com.example;

import java.sql.*;
import java.util.*;

public class Custmanual {
    private static String url = "jdbc:mysql://localhost/flipkart";
    private static String user = "root";
    private static String pass = "199812";

    public static void main(String[] args) throws SQLException {

        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost/flipkart", "root", "199812");
        Connection con = DriverManager.getConnection(url, user, pass);
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Options : ");
            System.out.println("1. Insert Values to Cust");
            System.out.println("2. Delete the values");
            System.out.println("3. Update Data");
            System.out.println("4. Display Data");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Details as ID, Name, City, Grade and Sales ID :");
                    Scanner s1 = new Scanner(System.in);
                    // int custid = s1.nextInt();
                    // String custname = s1.nextLine();
                    // String city = s1.nextLine();
                    // int grade = s1.nextInt();
                    // int salesid = s1.nextInt();
                    String custid = s1.nextLine();
                    String custname = s1.nextLine();
                    String city = s1.nextLine();
                    String grade = s1.nextLine();
                    String salesid = s1.nextLine();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?,?)");
                    ps.setString(1, custid);
                    ps.setString(2, custname);
                    ps.setString(3, city);
                    ps.setString(4, grade);
                    ps.setString(5, salesid);
                    ps.execute();
                    System.out.println("Values Inserted...!");
                    break;
                case 2:
                    System.out.println("Enter Customer ID required to Delete :");
                    Scanner s11 = new Scanner(System.in);
                    int custid2 = s11.nextInt();
                    Statement st1 = con.createStatement();
                    st1.execute("DELETE FROM CUSTOMER WHERE customer_id=" + custid2);
                    System.out.println(custid2 + " Data Deleted...!");
                    break;
                case 3:
                    System.out.println("Enter Data required to Update :");
                    Scanner s2 = new Scanner(System.in);
                    // System.out.println(" a-Customer_Id \n b-Cust Name \n c-City \n d-Grade \n e-Salesman_Id");
                    String valueb = s2.nextLine();
                    // System.out.println(" a-Customer_Id \n b-Cust Name \n c-City \n d-Grade \n e-Salesman_Id");
                    Scanner s3 = new Scanner(System.in);
                    int valuea = s3.nextInt();
                    PreparedStatement ps1 = con.prepareStatement("UPDATE CUSTOMER SET cust_name=? WHERE customer_id=?");
                    // System.out.println("Enter Complete SQL Query to UPDATE Req. DATA");
                    // Scanner s12 = new Scanner(System.in);
                    // String query = s12.nextLine();
                    // Statement st2 = con.createStatement();
                    // st2.execute(query);
                    ps1.setString(1, valueb);
                    ps1.setInt(2, valuea);
                    ps1.executeUpdate();
                    System.out.println("Updated...!");
                    break;
                case 4:
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMER");
                    while (rs.next()) {
                        System.out.print(rs.getInt("customer_id") + ", ");
                        System.out.print(rs.getString("cust_name") + ", ");
                        System.out.print(rs.getString("city") + ", ");
                        System.out.print(rs.getInt("grade") + ", ");
                        System.out.print(rs.getInt("salesman_id") + "\n");
                    }
                    break;
                case 5:
                    System.exit(0);
                    s.close();
                // case 6:
                //     Statement sst1 = con.createStatement();
                //     ResultSet rs1 = sst1.executeQuery("SELECT * FROM CUSTOMER");
                //     ResultSetMetaData metdata = rs1.getMetaData();
                //     int count = metdata.getColumnCount();
                //     for (int i = 1; i <= count; i++) {
                //         System.out.println(metdata.getColumnName(i));
                //     }
                //     break;
                default:
                    System.out.println("Wrong Input...");
                    break;
            }
        }
    }
}