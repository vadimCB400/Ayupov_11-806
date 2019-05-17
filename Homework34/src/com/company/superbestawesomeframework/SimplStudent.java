package com.company.superbestawesomeframework;

public class SimplStudent {
    int age;
    String name;

    public SimplStudent(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public SimplStudent(){
    }

    @Override
    public String toString() {
        return "SimplStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
