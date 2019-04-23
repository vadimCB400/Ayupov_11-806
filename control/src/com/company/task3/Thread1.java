package com.company.task3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Thread1 extends Thread {
    //Scanner sc = new Scanner("Files/text1.txt");

    @Override
    public void run() {
        Scanner sc =  null;
        try{
            sc = new Scanner(new File("text1.txt"));
        } catch (FileNotFoundException e){
        }
        while (sc.hasNextLine()) {
            Thread2 thread2 = new Thread2(sc.nextLine());
            thread2.start();
        }
    }
}
