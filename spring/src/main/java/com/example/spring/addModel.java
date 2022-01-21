package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class addModel {
    String a;
    int b;
    // public int getA() {
    //     return a;
    // }
    public int getB() {
        return b;
    }
    public String getA() {
        return a;
    }
}
