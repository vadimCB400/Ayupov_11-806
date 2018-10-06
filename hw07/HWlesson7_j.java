package com.company;

public class HWlesson7_j {
    public static boolean pal = true;
    public static void main(String[] args) {
        String s = "asddsa";
        if (t(0, s)) System.out.println("yes");
        else System.out.println("no");
    }
    public static boolean t(int index, String s) {
        if(index < s.length() / 2) {
            if(s.charAt(index) == s.charAt(s.length() - index - 1) && pal) {
                t(index += 1, s);
            }else{
                pal = false;
            }
        }
        return pal;
    }
}
