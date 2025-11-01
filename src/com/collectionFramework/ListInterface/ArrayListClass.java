package com.collectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add(1, "JavaScript"); // insert at index

        // Access
        System.out.println("Element at index 2: " + list.get(2));

        // Modify
        list.set(2, "C#");

        // Check
        System.out.println("Contains Python? " + list.contains("Python"));
        System.out.println("Index of JavaScript: " + list.indexOf("JavaScript"));

        // Remove
        list.remove("Python");
        list.remove(0);

        // Iterate
        for (String lang : list) {
            System.out.println("Lang: " + lang);
        }

        // Sublist
        List<String> subList = list.subList(0, 1);
        System.out.println("Sublist: " + subList);

        list.clear();
        System.out.println("Is Empty? " + list.isEmpty());
    }
}
