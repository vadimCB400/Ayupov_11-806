package com.company;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("a");

        list.stream()
                //.map(s -> s.length())
                .forEach(i -> System.out.println(i));

        for (String s: list) {
            System.out.println(s);
        }
    }
}
