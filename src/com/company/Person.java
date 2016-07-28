package com.company;

/**
 * Created by bradford on 7/27/16.
 */
public class Person {

    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String talking() {
        return "hello";
    }

    public String hello() {
        return "hello" + this.name;
    }
}
