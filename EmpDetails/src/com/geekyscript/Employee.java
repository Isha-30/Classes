package com.geekyscript;

public class Employee {
    int sal, hours;
    public void getInfo(int a, int b){
        this.sal = a;
        this.hours = b;
    }
    int addSal(){
        if(sal<500){
            sal = sal + 10;
        }
        return sal;
    }

    int addWork(){
        if(hours>6){
            sal = sal + 5;
        }
        return sal;
    }
}
