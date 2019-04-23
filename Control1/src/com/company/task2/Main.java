package com.company.task2;

import java.util.Comparator;

public class Main implements Comparator<SportBike> {
    public static void main(String[] args) {
    }

    @Override
    public int compare(SportBike o1, SportBike o2) {
        if (o1.getSpeed() > o2.getSpeed()){
            return 1;
        }else{
            return -1;
        }
    }

}
