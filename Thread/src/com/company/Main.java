package com.company;

public class Main {
    public static int mainSum = 0;

    public static void main(String[] args) throws InterruptedException {
        int [] arr = new int[400];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10);
        }

        CounterThread core1 = new CounterThread(arr, 0, 100);
        CounterThread core2 = new CounterThread(arr, 100, 200);
        CounterThread core3 = new CounterThread(arr, 200, 300);
        CounterThread core4 = new CounterThread(arr, 300, 400);

        core1.start();
        core2.start();
        core3.start();
        core4.start();

        core1.join();
        core2.join();
        core3.join();
        core4.join();



        int forSum = 0;
        for(int i = 0; i < arr.length; i++){
            forSum += arr[i];
        }

        System.out.println(mainSum + "  " + forSum);

    }
}