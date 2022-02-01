package com.example;

import java.util.*;
import java.sql.*;

public class StudentJDBC {
    public static void main(String[] args) throws SQLException {
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/java_training", "root", "199812");
        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println(" 1. Show Table Data \n 2. Insert Data into Table \n 3. Delete Data \n 4. Update Data \n 5. Truncate Table Data \n 6. Drop Table \n 7. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = scn.nextInt();
            switch(choice){
                case 1:
                    Statement st=conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS");
                    System.out.println("-------------------- TABLE DATA START --------------------");
                    while(rs.next()){
                        System.out.print(rs.getInt("ID") + ", ");
                        System.out.print(rs.getString("SNAME") + ", ");
                        System.out.print(rs.getInt("CLASS") + ", ");
                        System.out.print(rs.getString("GRADE") + ", ");
                        System.out.print(rs.getInt("MARKS") + ", ");
                        System.out.print(rs.getDate("DOB") + ", ");
                        System.out.print(rs.getString("PLACE") + ", ");
                        System.out.print(rs.getInt("PINCODE") + "\n");
                    }
                    System.out.println("-------------------- TABLE  DATA  END --------------------");
                break;

                case 5:
                    System.out.println("Do you want delete entire data?(y/n) : ");
                    Scanner sc2=new Scanner(System.in);
                    String ch2=sc2.nextLine();
                    switch(ch2){
                        case "y":
                            Statement st5=conn.createStatement();
                            st5.execute("TRUNCATE STUDENTS");
                            System.out.println("Data Deleted");
                        case "n":
                            System.out.println("Truncate Operation Failed.");
                        }
                break;

                case 6:
                    System.out.println("Do you want delete entire data?(y/n) : ");
                    Scanner sc3=new Scanner(System.in);
                    String ch3=sc3.nextLine();
                    switch(ch3){
                        case "y":
                            Statement st5=conn.createStatement();
                            st5.execute("DROP STUDENTS");
                            System.out.println("Data Dropped");
                        case "n":
                            System.out.println("Drop Operation Failed.");
                        }
                break;

                case 7:
                    scn.close();
                    System.exit(0);
                
                default:
                    System.out.println("********** INVALID CHOICE **********");
                break;
            }
        }
    }
}