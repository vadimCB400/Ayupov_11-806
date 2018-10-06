package com.company;

public class HWlesson7_g {
    public static void main(String[] args) {
        int q = 198;
        K(q);
    }
    static void K(int q){
        if (q < 10){
            System.out.print(q + " ");
            return;
        }else{
            K(q / 10);
            int l = q % 10;
            System.out.print(l + " ");
        }
    }
}
