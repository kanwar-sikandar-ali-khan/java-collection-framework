package com.test;


import java.util.*;

class TableOfTwo {

    static void printTable(int n) {

        // Base condition (STOP)
        if (n > 10) {
            System.out.println("stop");
            return;
        }

        // Print table line
        System.out.println("2 x " + n + " = " + (2 * n));

        // Recursive call
        System.out.println("before Recursive call ");
        printTable(n + 1);
        System.out.println("after Recursive call ");

    }


}

class  Employees{

    private String name ;
    private int salary;

    public Employees(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", Salary=" + salary +
                '}';
    }
}

 class CombinationSum8 {

    static void findCombinations(int[] arr, int target, int index,
                                 List<Integer> current) {

        // Base case: target achieved
        if (target == 0) {
            System.out.println(current);
            return;
        }

        // If target becomes negative or array ends
        if (target < 0 || index == arr.length) {
            return;
        }

        // Include current element
        current.add(arr[index]);
        findCombinations(arr, target - arr[index], index + 1, current);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        findCombinations(arr, target, index + 1, current);
    }

}
class Quesion {

    static String vowels = "aeiou";



    static int  findConsVowles(String s){
        int currentCount =0;
        int maxCount = 0;


        for(int i=0;i<s.length();i++){

            if(vowels.contains(String.valueOf(s.charAt(i)))){
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            }else{
                currentCount =0;
            }
        }

        return maxCount;
    }


   static public List<Employees> filterEmployees (){
       List<Employees> employeesList = new ArrayList<>();
       employeesList.add(new Employees("sajid", 345));
       employeesList.add(new Employees("hassan", 345));
       employeesList.add(new Employees("atif", 434));
       employeesList.add(new Employees("ssd", 3434));
       employeesList.add(new Employees("3434", 346565));


       return  employeesList;

    }

    static String findconsecutiveWords(List<String> list, String w) {
        int maxCount = 0;
        String result = "";

        for (String eachWord : list) {
            int currentCount = 0;

            // Compare characters one by one
            for (int j = 0; j < Math.min(eachWord.length(), w.length()); j++) {
                if (eachWord.charAt(j) == w.charAt(j)) {
                    currentCount++;
                } else {
                    break; // stop at first mismatch
                }
            }

            // Update result if this word has more consecutive matches
            if (currentCount > maxCount) {
                maxCount = currentCount;
                result = eachWord;
            }
        }

        return result;
    }

    static Set<Integer> findSortedArr (List<Integer> arr1, List<Integer> arr2) {
        Set<Integer> result = new TreeSet<>();
        List<Integer> givenData = new ArrayList<>();
        givenData.addAll(arr1);
        givenData.addAll(arr2);

        for (Integer item:givenData){
            result.add(item);
        }



        return result;
    }
}

public class DsaPractice {

    static void main(String[] args) {
//        Quesion.findConsVowles("aroigau");


//        int[] arr = {1, 2, 3, 2, 4, 3, 5, 3};
//
//        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        System.out.println(map);

        // Print duplicates
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey() + " -> " + entry.getValue());
//            }
//        }

//        System.out.println("vowels "+Quesion.findConsVowles("aroigau")+Quesion.filterEmployees());
//        System.out.println("filterEmployees "+Quesion.filterEmployees());


//        Map<Integer,Integer> mapEmpList = new HashMap<>();
//
//
//        for(Employees item:Quesion.filterEmployees()){
////            System.out.println("item "+item);
//
//            mapEmpList.put(item.getSalary(),mapEmpList.getOrDefault(item.getSalary(), 0)+1);
//
//        }

//        for (Map.Entry<Integer, Integer> entry : mapEmpList.entrySet()) {
//
//            int salary = entry.getKey();
//            int count = entry.getValue();
//
//            if (count > 1) {
//                System.out.println("Salary " + salary + " -> " + count);
//            }
//        }


//        mapEmpList.forEach((salary, count) -> {
//            if (count > 1) {
//                System.out.println("Salary " + salary + " -> " + count);
//            }
//        });

//        System.out.println("mapEmpList "+mapEmpList);


//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int target = 8;
//
//        CombinationSum8.findCombinations(arr, target, 0, new ArrayList<>());

//        TableOfTwo.printTable(1);

//        List<String> arr = Arrays.asList("apple", "apricot", "banana", "application", "ape");
//        Quesion.findconsecutiveWords(arr, "applicable");
//        String[] arr = {"apple", "apricot", "banana", "application", "ape"};
//        System.out.println(Quesion.findconsecutiveWords(Arrays.asList(arr), "applicable"));

        System.out.println(Quesion.findSortedArr(Arrays.asList(1,3,5), Arrays.asList(2,4,6)));

    }
}
