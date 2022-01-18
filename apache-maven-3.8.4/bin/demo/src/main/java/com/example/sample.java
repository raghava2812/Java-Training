package com.example;

public class sample {
    int ord_no;
    double purch_amt;
    String ord_date;
    int customer_id;
    int salesman_id;
    
    public sample(int ord_no, double purch_amt, String ord_date, int customer_id, int salesman_id) {
        this.ord_no = ord_no;
        this.purch_amt = purch_amt;
        this.ord_date = ord_date;
        this.customer_id = customer_id;
        this.salesman_id = salesman_id;
    }
    public int getOrd_no() {
        return ord_no;
    }
    public void setOrd_no(int ord_no) {
        this.ord_no = ord_no;
    }
    public double getPurch_amt() {
        return purch_amt;
    }
    public void setPurch_amt(double purch_amt) {
        this.purch_amt = purch_amt;
    }
    public String getOrd_date() {
        return ord_date;
    }
    public void setOrd_date(String ord_date) {
        this.ord_date = ord_date;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public int getSalesman_id() {
        return salesman_id;
    }
    public void setSalesman_id(int salesman_id) {
        this.salesman_id = salesman_id;
    }
    @Override
    public String toString() {
        return "sample [customer_id=" + customer_id + ", ord_date=" + ord_date + ", ord_no=" + ord_no + ", purch_amt="
                + purch_amt + ", salesman_id=" + salesman_id + "]";
    }
    
}
