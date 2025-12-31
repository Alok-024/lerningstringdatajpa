package com.example.learningdatajpa.entities;

public class Teacher {
    private int teacherId;
    private String name;
    private static final float PI=3.14f;

    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
