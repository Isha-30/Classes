package com.geekyscript;

public class Average {
    float a, b, c;
    Average(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getAverage(){
        double avg = (a+b+c)/3;
        return avg;
    }
}
