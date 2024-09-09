/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author Shimi
 */

    class Person {
    private String Name;
    private int Age;
    private String Gender;
    private String Address;
    
     public static void main(String[] args) {
        Person person1st = new Person("Mashrur", 26);
        person1st.display_Info();
        person1st.greet();

        Person person2nd = new Person("shimi", 24, "Female", "shekertek");
        person2nd.display_Info();
        person2nd.greet("Hope you are doing well:)");
    }

    public Person(String name, int age) {
        this.Name = name;
        this.Age = age;
        this.Gender = "Unknown";
        this.Address = "Unknown";
    }  
    public Person(String name, int age, String gender, String address) {
        this(name, age);
        this.Gender = gender;
        this.Address = address;
    }
    public void display_Info() {
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.Age);
        System.out.println("Gender: " + this.Gender);
        System.out.println("Address: " + this.Address);
    }

    public void greet() {
        System.out.println("Ohayooo!, it's " + this.Name);
    }

    public void greet(String message) {
        System.out.println("Ok, so I'm " + this.Name + ". " + message);
    }

   
}