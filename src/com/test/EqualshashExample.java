package com.test;

import java.util.*;

class Employee {

    private String name;
    private Integer salary;

    Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    // -------- equals() --------
    @Override
    public boolean equals(Object o) {
        // 1. Same reference
        if (this == o) return true;

        // 2. Null or different class
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Type cast
        Employee employee = (Employee) o;

        // 4. Compare fields
        return Objects.equals(name, employee.name)
                && Objects.equals(salary, employee.salary);
    }

    // -------- hashCode() --------
    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    // -------- toString() --------
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EqualshashExample {

    public static void main(String[] args) {

        Employee emp1 = new Employee("sajid", 33);
        Employee emp2 = new Employee("ameer", 4444);
        Employee emp3 = new Employee("attif", 2);
        Employee emp4 = new Employee("hassan", 33);
        Employee emp5 = new Employee("sajid", 33); // duplicate data

        // ================= LIST =================
        System.out.println("---- ArrayList ----");
        List<Employee> empList = new ArrayList<>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println(empList);
        System.out.println("List size: " + empList.size()); // 5

        // ================= HASHSET =================
        System.out.println("\n---- HashSet ----");
        Set<Employee> empSet = new HashSet<>();

        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);
        empSet.add(emp4);
        empSet.add(emp5); // ignored

        System.out.println(empSet);
        System.out.println("Set size: " + empSet.size()); // 4

        // ================= HASHMAP =================
        System.out.println("\n---- HashMap ----");
        Map<Employee, String> empMap = new HashMap<>();

        empMap.put(emp1, "Developer");
        empMap.put(emp2, "Tester");
        empMap.put(emp5, "Manager"); // overwrites emp1 value

        System.out.println(empMap);
        System.out.println("Map size: " + empMap.size()); // 2

        // ================= equals() & hashCode() =================
        System.out.println("\n---- equals() & hashCode() ----");
        System.out.println("emp1.equals(emp5): " + emp1.equals(emp5)); // true
        System.out.println("emp1.hashCode(): " + emp1.hashCode());
        System.out.println("emp5.hashCode(): " + emp5.hashCode());
    }
}
