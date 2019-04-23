package com.company.task3;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Thread2 extends Thread {
    private String s;
    public Thread2(String s){
        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public void run() {
        try {
            PrintWriter p = new PrintWriter(new FileOutputStream(new File("text2.txt")));
            p.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
