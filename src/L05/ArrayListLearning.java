package L05;

import java.util.*;

public class ArrayListLearning {

    public static void main(String[] args) {
        // collections List Map Set

        // Declaration
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);


        // Solution 1---------------
//        for (Integer number : myArrList) {
        // 1st
//            if(withoutDupList.isEmpty()){
//                withoutDupList.add(number);
//            }
        // 2nd
//            if(!withoutDupList.contains(number)){
//                withoutDupList.add(number);
//            }
//        }



        // Solution 2-------
        Set<Integer> set = new HashSet<>(myArrList);
        List<Integer> withoutDupList = new ArrayList<>(set);

        for (Integer integer : withoutDupList) {
            System.out.println(integer);
        }

        // sort -> subList

//        Collections.sort(withoutDupList); //Asc
        Collections.sort(withoutDupList, Collections.reverseOrder()); //Dsc

        // subList
        List<Integer> targetArrList = withoutDupList.subList(0,2); // 2nd parameter Exclusive
        System.out.println("===");
        for (Integer integer : targetArrList) {
            System.out.println(integer);
        }
    }
}
