package com.test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private long id;
    private String name;

    Person(long id ,String name){
        this.id=id;
        this.name = name;

    }

   public String getName (){
        return this.name;
    }
    public long getId (){
        return this.id;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Person that) {
        return this.name.compareTo(that.name);
    }
}

public class PersonTest {


    public static void main(String[] args){


        List<Person> psList= new ArrayList<>();

        psList.add(new Person(1,"sajid"));
        psList.add(new Person(2,"atif"));
        psList.add(new Person(3,"athear"));

         psList.stream().filter(item->item.getId()==1).forEach(System.out::println);

        List<Person> filteredList =
                psList.stream()
                        .filter(item -> item.getName().toLowerCase().startsWith("a"))
                        .toList();

        System.out.println("filteredList = " + filteredList);
        Collections.sort(psList);
        System.out.println("psList"+ psList);
    }


}







