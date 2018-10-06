package com.company;

public class HWlesson7_h {
    public static void main(String[] args) {
        double a = 37;
        int delitel = 2;
        if (Gangster(a, delitel)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
        static boolean Gangster(double a, int delitel) {
            if(a < 2) {
                return false;
            }
            else if(a == 2){
                return true;
            }
            else if (a % delitel == 0){
                return false;
            }
            else if (delitel < a / 2){
                return Gangster(a, delitel + 1);
            }
            else return true;
            }
        }
