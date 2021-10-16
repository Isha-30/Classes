package com.geekyscript;

public class Area {
    int l;
    int b;
    public void setDim(int a, int b){
        this.l = a;
        this.b = b;
    }
    public int getArea(){
        int area = l*b;
        return area;
    }
}
