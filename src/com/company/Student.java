package com.company;

public class Student {
    private String name;
    public int grade;

    Student(String name, int grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName(){
        return name;
    }
}
