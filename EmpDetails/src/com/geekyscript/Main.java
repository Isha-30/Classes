package com.geekyscript;

import java.util.Scanner;

//Write a program by creating an 'Employee' class having the
// following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
//3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary and daily working hours:");
        int s = sc.nextInt();
        int h = sc.nextInt();
        Employee emp = new Employee();
        emp.getInfo(s, h);
        System.out.println(emp.addSal());
        System.out.println(emp.addWork());
    }
}
