package com.example.springdemo;

public class samplespring {
    private String word;
    public void saymeow() {
        System.out.print("Hello...! Welcome Again :)");
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void speak() {
        System.out.print(" --> " + word);
    }
}