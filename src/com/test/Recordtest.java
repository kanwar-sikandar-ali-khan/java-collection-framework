package com.test;


import com.collectionFramework.Student;

import javax.crypto.SealedObject;
import java.util.Objects;
import java.util.regex.Pattern;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


sealed class Performance permits Employee {
    String category;
}
///  herre i use final beause of sealed
/// If a class is sealed, all its subclasses must be explicitly:
/// final, sealed, or non-sealed



final class Employee extends Performance implements Comparable<Employee> {

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
    @Override
    public int compareTo(Employee that) {
        return this.salary - that.salary;
    }


}
/// reduce boilder plate and for immutability
// record Employee(String name, Integer salary) {};


public class Recordtest {
    // ---------- REGEX EXAMPLE ----------
    static boolean isValidName(String name) {
        // Only letters, minimum 3 characters
        String regex = "^[A-Za-z]{3,}$";
        return Pattern.matches(regex, name);
    }

    // ---------- REFLECTION EXAMPLE ----------
    static void inspectEmployee(Employee emp) throws Exception {

        Class<?> clazz = emp.getClass();

        System.out.println("\n--- Reflection Info ---");

        // Class name
        System.out.println("Class Name: " + clazz.getName());

        // Modifiers
        System.out.println("Is final? " + Modifier.isFinal(clazz.getModifiers()));

        // Fields
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // access private fields

            System.out.println(
                    "Field: " + field.getName() +
                            ", Type: " + field.getType().getSimpleName() +
                            ", Value: " + field.get(emp)
            );
        }
    }

    public static void main(String[] args) throws Exception{



        // ---------- REGEX USAGE ----------
        String name = "sajid";

        if (!isValidName(name)) {
            System.out.println("Invalid employee name!");
            return;
        }

        Employee emp1 = new Employee("sajid", 220);
        System.out.println("resultt " +emp1);

        // ---------- REFLECTION USAGE ----------
        inspectEmployee(emp1);

    }
}
