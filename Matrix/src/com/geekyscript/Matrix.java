package com.geekyscript;

public class Matrix {
    int row, col;
    int [][] mat;
    Matrix(int r, int c){
        this.row = r;
        this.col = c;
        mat = new int[r][c];
    }
    void setElement(int i, int j, int ele){
        mat[i][j] = ele;
    }
    void display(){
        System.out.println("Matrix is:");
        for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
