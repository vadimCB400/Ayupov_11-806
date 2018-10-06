package com.company;

public class HWlesson7_f {
    public static void main(String[] args) {
        int p = 165;
        T(p);
    }
    static void T(int p){
        if (p < 10){
            System.out.print(p + " ");
            return;
        }else{
            int l = p % 10;
            System.out.print(l + " ");
            T(p / 10);
        }
    }
}
