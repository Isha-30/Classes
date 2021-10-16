package com.geekyscript;

import java.util.Scanner;

//Write a program to print the area of a rectangle by
// creating a class named 'Area' having two methods.
// First method named as 'setDim' takes length and breadth
// of rectangle as parameters and the second method named as 'getArea'
// returns the area of the rectangle. Length and breadth of
// rectangle are entered through keyboard.
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter the length of the rectangle:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle:");
        int b = sc.nextInt();
        Area rect = new Area();
        rect.setDim(a, b);
        System.out.println("Area = "+rect.getArea());
        Triangle tri = new Triangle();
        System.out.println("Area of triangle: "+tri.getArea(3,4,5));
    }
}
