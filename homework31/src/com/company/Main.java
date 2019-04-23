package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = shift(sc.nextLine());

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i).toString());
        }
    }

    public static ArrayList<String> shift(String str) {
        ArrayList<String> results = new ArrayList<>();
        results.add(Character.toString(str.charAt(0)));
        int num1 = str.length();

        for (int i = 1;  i < num1;  i++) {
            char c = str.charAt(i);
            int size = results.size();

            for (int j = 0;  j < size;  j++) {
                String p = results.remove(0);
                int num2 = p.length();

                for (int k = 0;  k <= num2;  k++) {
                    results.add(p.substring(0, k) + c + p.substring(k));
                }
            }
        }
        return results;
    }
}