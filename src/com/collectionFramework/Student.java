package com.collectionFramework;

import java.util.*;
import java.util.stream.Collectors;

class StudentInfo {
    String name;
    Integer rollNo;

    public StudentInfo(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentInfo{name='" + name + "', rollNo=" + rollNo + "}";
    }
}
public class Student implements Comparable<Student> {

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void testCollectionFramework(){

         Map<Number,StudentInfo> result = new HashMap<>();
        result.put(1, new StudentInfo("kanwar", 22));
        result.put(3, new StudentInfo("sikan", 23));
        System.out.println("result = " + result);

        for (StudentInfo student : result.values()) {
            System.out.println("Name: " + student.name + ", RollNo: " + student.rollNo);
        }



//        System.out.println("result"+result.values().stream().map(v->v).collect(Collectors.toList()));

        // Stream way
//        result.values()
//                .stream()
//                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }


    public static void main(String[] args) {
        Student class1 = new Student("sikandar",7);
        System.out.println(class1.name+class1.rollNo);
        class1.testCollectionFramework();

    }
}
