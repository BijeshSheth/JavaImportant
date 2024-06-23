package com.sheth.newfeature;

public class RecordDemo {

    public static void main(String[] args) {
        EmployeeRecord er = new EmployeeRecord("Bijesh", 30);
        System.out.println(er.name()+":::"+er.age());
        System.out.println(er.toString());
    }
}
