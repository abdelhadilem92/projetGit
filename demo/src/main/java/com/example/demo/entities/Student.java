package com.example.demo.entities;

public class Student {
    private int id;
    private String name;
    private int age; //abdelhadi
    private String gender; //abdelhadi
    private String email; //abdelhadi
    private String phone;


    public Student(int id, String name, int age, String gender, String email) {
        this.id = id;
    }//abdelhadi
    public int getId() {
        return id;
    }//abdelhadi
}
