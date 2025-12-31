package com.test;

import java.util.*;

/*
 NOTE:
 - Comparable = natural ordering (inside class)
 - Comparator = custom ordering (outside / lambda / utility)
*/

class Employee implements Comparable<Employee> {

    private String name;
    private Integer salary;

    Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters needed for Comparator
    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // -------- Comparable (Natural Order) --------
    // Default sorting → by salary (ascending)
    @Override
    public int compareTo(Employee that) {
        return this.salary.compareTo(that.salary);
        // ❌ avoid: this.salary - that.salary
    }
}

public class OrderingExample {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Sajid", 22));
        list.add(new Employee("Ali", 40));
        list.add(new Employee("Ahmed", 30));

        // ==================================================
        // 1️⃣ Comparable (Natural Ordering)
        // ==================================================
        // Uses compareTo()
         Collections.sort(list);
         System.out.println("Sorted by salary (Comparable):");
         list.forEach(System.out::println);

        // ==================================================
        // 2️⃣ Comparator using separate class
        // ==================================================

        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by name (Comparator class):");
        list.forEach(System.out::println);


        // ==================================================
        // 3️⃣ Comparator using Anonymous class
        // ==================================================

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        System.out.println("Sorted by name (Anonymous Comparator):");
        list.forEach(System.out::println);


        // ==================================================
        // 4️⃣ Comparator using Lambda (Java 8+)
        // ==================================================
        /*
        list.sort((e1, e2) -> e2.getSalary().compareTo(e1.getSalary()));
        System.out.println("Sorted by salary DESC (Lambda):");
        list.forEach(System.out::println);
        */

        // ==================================================
        // 5️⃣ Comparator utility methods (BEST PRACTICE ⭐)
        // ==================================================
        /*
        list.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted by name (Comparator.comparing):");
        list.forEach(System.out::println);
        */

        // ==================================================
        // 6️⃣ Multiple field sorting
        // ==================================================
        /*
        list.sort(
            Comparator.comparing(Employee::getSalary)
                      .thenComparing(Employee::getName)
        );
        System.out.println("Sorted by salary then name:");
        list.forEach(System.out::println);
        */

        // ==================================================
        // 7️⃣ Stream sorting
        // ==================================================
        /*
        list.stream()
            .sorted(Comparator.comparing(Employee::getName))
            .forEach(System.out::println);
        */

        // ==================================================
        // Default run (no sorting)
        // ==================================================
        System.out.println("Original list:");
        list.forEach(System.out::println);
    }
}


 // -------- Separate Comparator class (OPTIONAL) --------
 class NameComparator implements Comparator<Employee> {
     @Override
     public int compare(Employee e1, Employee e2) {
         return e1.getName().compareToIgnoreCase(e2.getName());
     }
 }
