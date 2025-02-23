package com.example.demo.entities;

public class Employee {
    private int id;
    private String firstName;//ilyas
    private String name;
    private String lastName; //ilyas
    private int age;
    private String email; //ilyas
    private String phone; //ilyas

    public Employee(int id, String name, int age, String email) {} //ilyas

   public Employee(int id, String firstName, String name, int age, String email, String phone) {
  this.id = id;
   }//abdelhadi




    public Employee(int id, String firstName, String name, String lastName, int age, String email){
        this.id = id;
    }//abdelhadi



}
