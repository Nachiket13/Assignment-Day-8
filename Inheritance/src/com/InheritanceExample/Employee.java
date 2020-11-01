package com.InheritanceExample;

import java.util.Scanner;

public class Employee {
    String name;
    int age;
    double salary;

    Scanner sc = new Scanner(System.in);

    public void getDetails(){
        System.out.println("Enter The Name Age And Salary of Employee:");
        name =  sc.next();
        age = sc.nextInt();
       // sc.nextLine();
        salary = sc.nextDouble();
    }
    public void displayDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
