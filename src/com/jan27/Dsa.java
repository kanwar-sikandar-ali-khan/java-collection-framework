package com.jan27;


import java.util.*;

class Person implements Comparable<Person>{
    String name;
    String phone;
    Integer  dues;

    public Person(String name, String phone, Integer dues) {
        this.name = name;
        this.phone = phone;
        this.dues = dues;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getDues() {
        return dues;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Person person = (Person) that;
        return Objects.equals(this.name, person.name) && Objects.equals(this.phone, person.phone) && Objects.equals(this.dues, person.dues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, dues);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", dues=" + dues +
                '}';
    }

    @Override
    public int compareTo(Person that) {
        return that.dues.compareTo(this.dues);
    }
}
class Employee{




    void checking(){

        int[] arr1 = new int[3];


        System.out.println(Arrays.toString(arr1));
    }

    void printTable(int n){

        if(n>10){
            return;
        }
        System.out.println("2" + "x" + n + "=" + 2*n);

        printTable(n+1);

    }

    void printTableByloop (){

        for (int i = 1; i <=10  ; i++) {

            System.out.println("2" + "x" + i + "=" + 2*i);

        }
    }


}


public class Dsa {





    static void main(String[] args) {

        List<Person> personList = new LinkedList<>();

        personList.add(new Person("sajid","454544545",2));
        personList.add(new Person("atig","454545344545",24));
        personList.add(new Person("dsd","454543212124545",344));
        personList.add(new Person("ameer","454665544545",56));

        Person ps1 =   new Person("ameer","454665544545",56);
        Person ps2 =   new Person("atif","3443",56);

//        List<Person> filterByname = personList.stream().filter(p->p.getName().startsWith("a")).toList();
//        System.out.println(filterByname);

//        personList.stream().filter(p->p.getName().startsWith("a")).forEach(System.out::println);


//        System.out.println(personList.stream().findFirst());

//        System.out.println(personList.stream().skip(1).findFirst());


//        personList.stream().filter(p->p.getDues() > 60).forEach(System.out::println);

//        personList.stream().filter(p->p.getName().contains("i")).forEach(System.out::println);
//        String sa1 = new String("abc");
//        String sb2 = new String("abc");
//        System.out.println(sa1.equals(sb2));

//        System.out.println(ps1.equals(ps2));

        Collections.sort(personList);
        System.out.println(personList);



    }
}
