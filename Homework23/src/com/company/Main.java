package com.company;

public class Main {
    public static void main(String[] args) {
        Students Vadim = new Students("Vadim", "Ayupov",806);
        Students Vadim2 = new Students(new String("Vadim"), new String("Ayupov"),806);
        if(Vadim.equals(Vadim2) && Vadim.hashCode() == Vadim2.hashCode())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
