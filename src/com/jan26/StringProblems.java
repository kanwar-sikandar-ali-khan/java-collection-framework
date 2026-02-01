package com.jan26;






public class StringProblems {


    String vowels = "aeiou";


    Integer findVowels (String s){



        int currentCount=0;
        int maxCount=0;
        for (int i = 0; i < s.length() ; i++) {

//            System.out.println(s.charAt(i));
//
//

            if(vowels.contains(String.valueOf(s.charAt(i)))){

                currentCount++;
                maxCount = Math.max(currentCount, maxCount);


            }else {
                currentCount=0;
            }

        }
        return  maxCount;

    }

    static void main(String[] args) {

        StringProblems obj1 = new StringProblems();

       System.out.println( obj1.findVowels("aelmnoui"));


    }
}
