package com.test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class ParentPerson{

    private int family_group_number;

    public ParentPerson(int family_group_number ) {


        this.family_group_number = family_group_number;


    }

    public int getFamily_group_number() {
        return this.family_group_number;
    }
}

class Person extends ParentPerson{
    private String name;
    private int phone_number;

    public Person(String name, int phone_number) {
        this.name = name;
        this.phone_number = phone_number;
        super(232323);
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString(){
        return "Person{" +
                "name='" + name + '\'' +
                ", phone=" + phone_number +
                '}';
    }


}
public class Problem2jan {

    public static void main(String[] args) {

        List<Person> personList = new LinkedList<>();

        personList.add(new Person("sajid", 96566));
        personList.add(new Person("aif", 0335));
        personList.add(new Person("ameer", 0335));
        personList.add(new Person("ahmed", 03352));

        Person ps1 = new Person("kanwar", 2332);

        System.out.println("ps1"+ps1.getFamily_group_number());


        List<Person> filterpersonList = new LinkedList<>();

//        for (int i = 0; i < personList.size() ; i++) {
//
//            if(personList.get(i).getPhone_number() ==0335 ){
//                filterpersonList.add(personList.get(i));
//            }
//        }


//        for (Person pslist : personList) {
//            if(pslist.getPhone_number() ==0335 ){
//                filterpersonList.add(pslist);
//            }
//        }

//        List<Person> pslwithstream = personList.stream().filter(p->p.getPhone_number() == 0335).toList();
//        System.out.println("pslwithstream"+pslwithstream);
//        final String vowels = "ejehiolao";

//        int countConsVowels = 0;
//        for (int i = 0; i <vowels.length() ; i++) {
//
//            if(vowels.charAt(i) == 'a'){
//                countConsVowels+=1;
//            }
//
//        }
//        System.out.println("vowels"+vowels);



//        Person firstElement = personList.stream().findFirst().get();
//        System.out.println("firstElement"+firstElement);


                Person secondElement = personList.stream().skip(1).findFirst().get();
        System.out.println("secondElement"+secondElement);

//        List<Person> filterByName = personList.stream().filter(p->p.getName().startsWith("s")).toList();
//        System.out.println("filterByName"+filterByName);
//        System.out.println("filterpersonList"+filterpersonList);
        System.out.println("personList"+personList);

    }
}
