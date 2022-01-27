package com.example.spring;

import java.util.Scanner;

import org.yaml.snakeyaml.events.StreamStartEvent;

public class junitcodes {
    public static int add(int a,int b){
        return (a+b);
    }

    public static int sub(int a,int b){
        return (a-b);
    }

    public static int mul(int a,int b){
        return (a*b);
    }

    public static int div(int a,int b){
        return (a/b);
    }

    public static int modu(int a,int b){
        return (a%b);
    }

    public static boolean even(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    static class Test{
        public static void addTest(){
            if(junitcodes.add(12, 20) == 32){
                System.out.println("Add : Testcase Passed!");
            }
            else
            {
                System.out.println("Add : Testcase Failed");
            }
        }

        public static void subTest(){
            if(junitcodes.sub(22, 12) == 10){
                System.out.println("Sub : Testcase Passed!");
            }
            else
            {
                System.out.println("Sub : Testcase Failed");
            }
        }

        public static void mulTest(){
            if(junitcodes.mul(12, 2) == 32){
                System.out.println("Mul : Testcase Passed!");
            }
            else
            {
                System.out.println("Mul : Testcase Failed");
            }
        }

        public static void divTest(){
            if(junitcodes.div(12, 20) == 32){
                System.out.println("Div : Testcase Passed!");
            }
            else
            {
                System.out.println("Div : Testcase Failed");
            }
        }

        public static void modTest(){
            if(junitcodes.modu(12, 20) == 32){
                System.out.println("Mod : Testcase Passed!");
            }
            else
            {
                System.out.println("Mod : Testcase Failed");
            }
        }

        public static void evenTest(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Number to Check Even:  ");
            int data=sc.nextInt();
            if(junitcodes.even(data)==true){
                System.out.println(data + " is Even -> Passed");
            }else{
                System.out.println(data + " is Odd -> Failed");
            }
            sc.close();
        }
    }

    public static void main(String[] args) {
        Test.addTest();
        Test.subTest();
        Test.mulTest();
        Test.divTest();
        Test.modTest();
        Test.evenTest();
    }
}