package com.example;

public class fktcust {
    int customer_id;
    String cust_name;
    String city;
    int grade;
    int salesman_id;
    public fktcust(int customer_id, String cust_name, String city, int grade, int salesman_id) {
        this.customer_id = customer_id;
        this.cust_name = cust_name;
        this.city = city;
        this.grade = grade;
        this.salesman_id = salesman_id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public String getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getSalesman_id() {
        return salesman_id;
    }
    public void setSalesman_id(int salesman_id) {
        this.salesman_id = salesman_id;
    }

    @Override
    public String toString() {
        return " [customer_id=" + customer_id + ", cust_name=" + cust_name + ", city=" + city + ", grade="
                + grade + ", salesman_id=" + salesman_id + "]";
    }

}
