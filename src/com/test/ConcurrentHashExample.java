package com.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

 class Employee {

    private String name ;
    private  Integer salary;


    Employee(String name,Integer salary){

        this.name = name;
        this.salary = salary;

    }




    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", Salary=" + salary +
                '}';
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollNo == student.rollNo;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(rollNo);
//    }
//
//    @Override
//    public int compareTo(Student that) {
//        return this.rollNo - that.rollNo;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj == null || !(obj instanceof Student) ) {
//            return false;
//        }
//        Student s = (Student)obj;
//
//        return this.name.equals(s.name)
//                && this.id == s.id
//                && this.className.equals(s.className);
//    }

    //    @Override
//    public int hashCode() {
//        int prime = 19;
//        int result = 1;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        result = prime * result + ((className == null) ? 0 : className.hashCode());
//        result = prime * result + id;
//        return result;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if(obj == null || !(obj instanceof Student) ) {
//            return false;
//        }
//        Student s = (Student)obj;
//
//        return this.name.equals(s.name)
//                && this.id == s.id
//                && this.className.equals(s.className);
//    }
//
//    @Override
//    public int hashCode() {
//        int prime = 19;
//        int result = 1;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        result = prime * result + ((className == null) ? 0 : className.hashCode());
//        result = prime * result + id;
//        return result;
//    }
//



}

 class ConcurrentHashExample {


   public static void main(String[] args) {

       Map<Integer,Employee> mapList = new ConcurrentHashMap<>();


       mapList.put(1, new Employee("sajid", 22));
       mapList.put(133, new Employee("sajid", 22));


       System.out.println("mapList"+mapList);

    }


}
