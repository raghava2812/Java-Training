package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    String id;
    String name;
    String dob;
    String role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee(String id, String name, String dob, String role) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee [dob=" + dob + ", id=" + id + ", name=" + name + ", role=" + role + "]";
    }

    
}