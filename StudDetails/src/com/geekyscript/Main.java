package com.geekyscript;

import java.util.Scanner;

//Assign and print the roll number, phone number and address
// of two students having names "Sam" and "John" respectively by
// creating two objects of class 'Student'.
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("Enter Sam's Roll no. and Phone No. : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        Details Sam = new Details(a, b);
        System.out.println(Sam.rollNo +" Sam has Phone No." + Sam.phoneNo);
        System.out.print("Enter John's Roll no. and Phone No. : ");
        int x = sc.nextInt();
        long y = sc.nextLong();
        Details John = new Details(x, y);
        System.out.println(John.rollNo +" John has Phone No."+ John.phoneNo);
    }
}
