package com.bl.di;

public class Student {

    private int studentId;
    private String studentName;

    public void displayStudentInfo() {
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentId);
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("name set");
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
        System.out.println("id set");
    }


}
