package com.geekyscript;

public class Triangle {
    int a, b , c;
    public double getArea(int a, int b, int c){
        float s = getPeri(a, b, c)/2;
        double area = Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
        return area;
    }
    public int getPeri(int a, int b, int c){
        int p = a+b+c;
        return p;
    }
}
