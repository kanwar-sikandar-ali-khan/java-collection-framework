package com.jan26;

import java.util.ArrayList;
import java.util.List;

public class ConsectiveChar {



    String matchConsuctiveChar(String w, List<String> listString){


//        System.out.println(s+listString);
        int maxCount =0;
        String result = "";
       for (String eachWord:listString){
           int currentCount =0;

           for (int j = 0; j < Math.min(eachWord.length(), w.length()); j++) {

               if(eachWord.charAt(j)==w.charAt(j)){

                   currentCount++;
               }else{
                   break;
               }
           }

           if(currentCount>maxCount){
               maxCount= currentCount;
               result = eachWord;
           }
       }

        return result;
    }

    static void main(String[] args) {


        ConsectiveChar obj1 = new ConsectiveChar();
        List<String> list = new ArrayList<>(List.of("saad", "sajid"));
        System.out.println(obj1.matchConsuctiveChar("as",list));


    }
}
