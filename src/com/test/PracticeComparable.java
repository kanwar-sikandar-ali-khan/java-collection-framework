package com.test;
import java.util.*;


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



    @Override
    public int compareTo(Employee that){
        return that.salary.compareTo(this.salary);
    }



}


public class PracticeComparable {

    public static void main(String[] args) {


        List<Employee> empList = new ArrayList<>();

        Employee emp1 = new Employee("'sajid'",33);
        Employee emp2 = new Employee("'ameer'",4444);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(new Employee("attif",2));
        empList.add(new Employee("hassan",33));
        empList.add( new Employee("'sajid'",33));



        //sorting with comparable inside the class
//        Collections.sort(empList);

        //sorting with comparator outside the class
//        empList.sort(new SalarySortComparableClass());
//        System.out.println("empList"+empList);

//        for(int i=0;i<empList.size();i++){
//            System.out.println("emp"+i+empList.get(i));
//        }
//        for(Employee emp:empList){
//            System.out.println("emp"+emp);
//        }
//        empList.forEach(System.out::println);

        // 3️⃣ Comparator using Anonymous class
        // ==================================================

//        Collections.sort(list, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getName().compareTo(e2.getName());
//            }
//        });
//        System.out.println("Sorted by name (Anonymous Comparator):");


        // ==================================================
        // 4️⃣ Comparator using Lambda (Java 8+)
        // ==================================================

//        empList.sort((e1, e2) -> e2.getSalary().compareTo(e1.getSalary()));
//        empList.forEach(System.out::println);


//        empList.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .forEach(System.out::println);

//        empList.stream().filter(emp->emp.getSalary()>1000).forEach(System.out::println);


        System.out.println("Employees=>"+empList);



    }
}

class SalarySortComparableClass implements Comparator<Employee>{

    @Override
    public int compare (Employee emp1,Employee emp2){
        return emp2.getSalary().compareTo(emp1.getSalary());
    }
}