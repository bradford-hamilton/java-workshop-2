package com.company;

/**
 * Created by bradford on 7/27/16.
 */
class Student extends Person implements IStudent{
    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public String talk() {
        return "Hello " + this.getName();
    }

    @Override
    public String yell() {
        return "HELLO " + this.getName();
    }

    @Override
    public String talking() {
        return super.talking();
    }

    public int doMath(int num1, int num2) {
        return num1 + num2;
    }

    public int doMath(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}
