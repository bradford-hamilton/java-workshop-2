package com.company;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person("Bradford", 26, "Male");
        Student student = new Student("Bradford", 26, "Male");

        System.out.println(student.talk());
        System.out.println(student.yell());
    }
}
