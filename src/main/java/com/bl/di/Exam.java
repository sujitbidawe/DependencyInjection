package com.bl.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {

        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");

        Student student1 = context.getBean("someName", Student.class);
        student1.displayStudentInfo();

        Student student2 = context.getBean("sujit", Student.class);
        student2.displayStudentInfo();
    }
}
