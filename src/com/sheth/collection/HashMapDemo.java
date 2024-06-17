package com.sheth.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Student s1 = new Student(101, "sheth1");
        Student s2 = new Student(101, "sheth1");
        Student s3 = new Student(101, "sheth1");

        Map<Student, String> map = new HashMap<>();
        map.put(s1, "Student1");
        map.put(s2, "Student2");
        map.put(s3, "Student3");

        for(Map.Entry<Student, String> m : map.entrySet()){
            System.out.println(m.getKey()+" == "+m.getValue());
        }

        //s3.setId(1000);
        System.out.println(map.get(s3));

    }

}
