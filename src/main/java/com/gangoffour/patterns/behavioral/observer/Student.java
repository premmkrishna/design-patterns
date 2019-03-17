package com.gangoffour.patterns.behavioral.observer;


public class Student implements Observer {

    private final String name;
    private int mark;
    private Subject gradeSystem;

    Student(String name) {
        this.name = name;
        mark = 0;
    }

    public void setSubject(Subject gradeSystem) {
        this.gradeSystem = gradeSystem;
    }

    @Override
    public void update() {
        int mark = (int) gradeSystem.getUpdate();
        System.out.println("Increasing marks of " + name + " by " + mark);
        this.mark += mark;
    }

    public int getMark() {
        return mark;
    }
}