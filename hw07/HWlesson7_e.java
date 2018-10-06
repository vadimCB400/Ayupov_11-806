package com.company;

public class HWlesson7_e {
    public static void main(String[] args) {
        int a = 356;
        System.out.println(bmw(a));
    }
    static int bmw(int a){
    if(a < 10){
    return a;
    }else{
        return a % 10 + bmw(a / 10);
    }
    }
}