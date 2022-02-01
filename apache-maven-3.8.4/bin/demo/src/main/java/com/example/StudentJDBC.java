package com.example;

import java.util.*;
import java.sql.*;

public class StudentJDBC {
    public static void main(String[] args) throws SQLException {
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/java_training", "root", "199812");
        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("____________________ CHOICE ____________________");
            System.out.println(" 1. Show Table Data \n 2. Insert Data into Table \n 3. Delete Data \n 4. Update Data \n 5. Truncate Table Data \n 6. Drop Table \n 7. Enter Complete SQL Query \n 8. Exit");
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
                    System.out.println("--------------------- TABLE DATA END ---------------------");
                break;

                case 2:
                    System.out.print("How many records you want to Insert :");
                    Scanner sc2 = new Scanner(System.in);
                    Scanner scm2 = new Scanner(System.in);
                    int str2 = scm2.nextInt();
                    for (int i = 1; i <= str2; i++) {
                        System.out.println("Enter data as ID, Name, Class, Grade, Marks, DOB, Place, Pincode ["+i+"] :");
                        System.out.print("ID Number : ");
                        String sid = sc2.nextLine();
                        System.out.print("Name : ");
                        String sname = sc2.nextLine();
                        System.out.print("Class(Number) : ");
                        String sclass = sc2.nextLine();
                        System.out.print("Grade (O,A+,A,B,C,D,E,Fail) :");
                        String  sgrade= sc2.nextLine();
                        System.out.print("Marks(Number) : ");
                        String smarks = sc2.nextLine();
                        System.out.print("Date of Birth(YYYY/MM/DD) : ");
                        String sdob = sc2.nextLine();
                        System.out.print("Place : ");
                        String splace = sc2.nextLine();
                        System.out.print("Pincode : ");
                        String spincode = sc2.nextLine();
                        PreparedStatement ps2 = conn.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?,?,?,?,?,?)");
                        ps2.setString(1, sid);
                        ps2.setString(2, sname);
                        ps2.setString(3, sclass);
                        ps2.setString(4, sgrade);
                        ps2.setString(5, smarks);
                        ps2.setString(6, sdob);
                        ps2.setString(7, splace);
                        ps2.setString(8, spincode);
                        ps2.execute();
                        System.out.println( i +" Record Values Inserted....");
                        System.out.println();
                    }
                break;

                case 3:
                    System.out.println("Enter Student ID required to Delete :");
                    Scanner sc13 = new Scanner(System.in);
                    int stdid = sc13.nextInt();
                    Statement st13 = conn.createStatement();
                    st13.execute("DELETE FROM STUDENTS WHERE id=" + stdid);
                    System.out.println(stdid + " Data Deleted...!");
                break;

                case 4:
                    System.out.println("Table Contains : \n \t a) ID, b) Name, c) Class, d) Grade, e) Marks, f) DOB, g) Place, h) Pincode");
                    System.out.print("Enter which field you want to Update : ");
                    Scanner scn4 = new Scanner(System.in);
                    String ch4 = scn4.nextLine();
                    switch(ch4){
                        case "a":
                            Scanner sc41 = new Scanner(System.in);
                            System.out.print("ID to Update : ");
                            int valueb = sc41.nextInt();
                            System.out.print("Select ID : ");
                            int valuea = sc41.nextInt();
                            PreparedStatement ps4 = conn.prepareStatement("UPDATE STUDENTS SET id=? WHERE id=?");
                            ps4.setInt(1, valueb);
                            ps4.setInt(2, valuea);
                            ps4.executeUpdate();
                            System.out.println("ID Updated...!");
                        break;
                        case "b":
                            Scanner sc4b = new Scanner(System.in);
                            System.out.print("Enter Name to Update: ");
                            String valuebb = sc4b.nextLine();
                            Scanner sc41b = new Scanner(System.in);
                            System.out.print("Select ID : ");
                            int valueab = sc41b.nextInt();
                            PreparedStatement ps4b = conn.prepareStatement("UPDATE STUDENTS SET sname=? WHERE id=?");
                            ps4b.setString(1, valuebb);
                            ps4b.setInt(2, valueab);
                            ps4b.executeUpdate();
                            System.out.println("Name Updated...!");
                        break;
                        case "c":
                            Scanner sc4c = new Scanner(System.in);
                            System.out.print("Class(Number) : ");
                            String valuebc = sc4c.nextLine();
                            Scanner sc41c = new Scanner(System.in);
                            System.out.print("Select ID : ");
                            int valueac = sc41c.nextInt();
                            PreparedStatement ps4c = conn.prepareStatement("UPDATE STUDENTS SET class=? WHERE id=?");
                            ps4c.setString(1, valuebc);
                            ps4c.setInt(2, valueac);
                            ps4c.executeUpdate();
                            System.out.println("Class Updated...!");
                        break;
                        case "d":
                            Scanner sc4d = new Scanner(System.in);
                            System.out.print("Grade (O,A+,A,B,C,D,E,Fail) :");
                            String valuebd = sc4d.nextLine();
                            Scanner sc41d = new Scanner(System.in);
                            System.out.print("Select ID : ");
                            int valuead = sc41d.nextInt();
                            PreparedStatement ps4d = conn.prepareStatement("UPDATE STUDENTS SET grade=? WHERE id=?");
                            ps4d.setString(1, valuebd);
                            ps4d.setInt(2, valuead);
                            ps4d.executeUpdate();
                            System.out.println("Grade Updated...!");
                        break;
                        case "e":
                            Scanner sc41e = new Scanner(System.in);
                            System.out.print("Marks(Number) : ");
                            int valuebe = sc41e.nextInt();
                            System.out.print("Select ID : ");
                            int valueae = sc41e.nextInt();
                            PreparedStatement ps4e = conn.prepareStatement("UPDATE STUDENTS SET marks=? WHERE id=?");
                            ps4e.setInt(1, valuebe);
                            ps4e.setInt(2, valueae);
                            ps4e.executeUpdate();
                            System.out.println("Marks Updated...!");
                        break;
                        case "f":
                            Scanner sc4f = new Scanner(System.in);
                            System.out.print("Date of Birth(YYYY/MM/DD) : ");
                            String valuebf = sc4f.nextLine();
                            Scanner sc41f = new Scanner(System.in);
                            System.out.print("Select ID : ");
                            int valueaf = sc41f.nextInt();
                            PreparedStatement ps4f = conn.prepareStatement("UPDATE STUDENTS SET dob=? WHERE id=?");
                            ps4f.setString(1, valuebf);
                            ps4f.setInt(2, valueaf);
                            ps4f.executeUpdate();
                            System.out.println("Date of Birth Updated...!");
                        break;
                        case "g":
                            Scanner sc4g = new Scanner(System.in);
                            System.out.print("Place : ");
                            String valuebg = sc4g.nextLine();
                            Scanner sc41g = new Scanner(System.in);
                            System.out.print("Select ID : ");
                            int valueag = sc41g.nextInt();
                            PreparedStatement ps4g = conn.prepareStatement("UPDATE STUDENTS SET place=? WHERE id=?");
                            ps4g.setString(1, valuebg);
                            ps4g.setInt(2, valueag);
                            ps4g.executeUpdate();
                            System.out.println("Place Updated...!");
                        break;
                        case "h":
                            Scanner sc41h = new Scanner(System.in);
                            System.out.print("Pincode : ");
                            int valuebh = sc41h.nextInt();
                            System.out.print("Select ID : ");
                            int valueah = sc41h.nextInt();
                            PreparedStatement ps4h = conn.prepareStatement("UPDATE STUDENTS SET pincode=? WHERE id=?");
                            ps4h.setInt(1, valuebh);
                            ps4h.setInt(2, valueah);
                            ps4h.executeUpdate();
                            System.out.println("Pincode Updated...!");
                        break;
                        default:
                            System.out.println("Wrong Option");
                    }
                break;

                case 5:
                    System.out.println("Note : Truncating will clear all row data present in the table");
                    System.out.println("Do you want delete entire data?(y/n) : ");
                    Scanner sc5=new Scanner(System.in);
                    String ch5=sc5.nextLine();
                    switch(ch5){
                        case "y":
                            Statement st5=conn.createStatement();
                            st5.execute("TRUNCATE STUDENTS");
                            System.out.println("Data Deleted");
                        case "n":
                            System.out.println("Truncate Operation Failed.");
                        }
                    System.out.println();
                break;

                case 6:
                    System.out.println("Note : Droping will delete table data and properties from Database");
                    System.out.println("Do you want delete entire Table?(y/n) : ");
                    Scanner sc6=new Scanner(System.in);
                    String ch6=sc6.nextLine();
                    switch(ch6){
                        case "y":
                            Statement st5=conn.createStatement();
                            st5.execute("DROP TABLE STUDENTS");
                            System.out.println("Data Dropped");
                        case "n":
                            System.out.println("Drop Operation Failed.");
                        }
                    System.out.println();
                break;

                case 7:
                    System.out.println("(Note: Select Command will work but they won't Display)\nWrite Complete SQL Query to Proceed : ");
                    Statement st7 = conn.createStatement();
                    Scanner sc7 = new Scanner(System.in);
                    String query = sc7.nextLine();
                    st7.execute(query);
                    System.out.println("Query Executed Successfully....");
                break;

                case 8:
                    scn.close();
                    System.exit(0);
                
                default:
                    System.out.println("********** INVALID CHOICE **********");
                break;
            }
        }
    }
}