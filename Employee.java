/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author Shimi
 */
    class Employee {
    private String Name;
    private int ID;
    private Double Salary;
    private String Designation;
    
     public static void main(String[] args) {
        Employee person1st = new Employee("Mashrur", 211014021);
        person1st.display_Info();
        person1st.greet();

        Employee person2nd = new Employee("shimi", 211014026, 45000, "Manager");
        person2nd.display_Info();
        person2nd.greet("Hope you are doing well:)");
    }

    public Employee(String name, int id) {
        this.Name=name;
        this.ID=id;
        this.Salary=0.0;
        this.Designation="Unknown";
    }  
    public Employee(String name, int id, double salary, String designation) {
        this(name, id);
        this.Salary=salary;
        this.Designation=designation;
    }
    public void display_Info() {
        System.out.println("Name: " + this.Name);
        System.out.println("ID: " + this.ID);
        System.out.println("Salary: " + this.Salary);
        System.out.println("Designation: " + this.Designation);
    }

    public void greet() {
        System.out.println("Ohayooo!, it's " + this.Name);
    }

    public void greet(String message) {
        System.out.println("Ok, so I'm " + this.Name + ". " + message);
    }

   
}