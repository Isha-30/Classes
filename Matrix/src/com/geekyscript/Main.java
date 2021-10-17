package com.geekyscript;

import java.util.Scanner;

//Create a class called 'Matrix' containing constructor that
// initializes the number of rows and number of columns of a new Matrix object.
// The Matrix class has the following information:
//1 - number of rows of matrix
//2 - number of columns of matrix
//3 - elements of matrix in the form of 2D array
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns:");
        int c = sc.nextInt();
        Matrix m1 = new Matrix(r,c);
        System.out.print("Enter the elements:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int k = sc.nextInt();
                m1.setElement(i, j,k);
            }
        }
        m1.display();
    }
}
