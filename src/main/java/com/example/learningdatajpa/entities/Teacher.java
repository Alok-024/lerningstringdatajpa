package com.example.learningdatajpa.entities;

public class Teacher {
    private int teacherId;
    private String name;

    public int getId() {
        return teacherId;
    }

    public void setId(int id) {
        this.teacherId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
