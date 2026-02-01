package dsaQuestion;


import java.util.*;

public class FindDuplicate {

    static void main(String[] args) {

        int[] arr1 = new int[]{3,1,2,1,3};


//        System.out.println(Arrays.toString(eachKey));

        Map<Integer,Integer> findDuplicate = new HashMap<>();

        for(int eachKey:arr1){
//            System.out.println(eachKey);
            findDuplicate.put(eachKey, findDuplicate.getOrDefault(eachKey, 0)+1) ;

        }
//        System.out.println(findDuplicate);

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> eachValue: findDuplicate.entrySet()){

            if(eachValue.getValue()>1){
//                System.out.println(eachValue);
                result.add(eachValue.getKey());

            }
        }

        System.out.println(result);

    }
}
