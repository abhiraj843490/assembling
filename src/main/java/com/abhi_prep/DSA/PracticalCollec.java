package com.abhi_prep.DSA;

import java.util.*;

public class PracticalCollec {
    public static void main(String[]args){
        /*

                                                                                   collection ----- interface                               10x1.5 = 15
                                                                                    /                   \
                                                                              list (interface)(10)          set(interface)(16)
                                                                              /          \                   \
                                                                            ArrayList    stack, vector     HashSet, prioritySet, TreeSet


                                                                        (interface)    Map (not collection)(16)
                                                                                       /              \
                                                                                       HashMap       TreeMap, priorityMap
                                    traversing    --  cursor
                                    Global for collection framework --
                                             Iterator   ---- > move only forward
                                             Enumeration   --> only with list
                                             ListIterator  ---> move backward || forward both

                                             for loop  ---- foreach
         */

//        List<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.println("size "+list1.size());

//        list1.add(68);
//        list1.add(6875);
//        list1.add(687);

        for(int i=0;i<list1.size();i++){

        }

//        for (Integer integer : list1) {
//            System.out.println(integer + "  ");
//        }
        Iterator iterator = list1.iterator();
        ListIterator listIterator = list1.listIterator();

        // 45,  67,   89, 90

        while (iterator.hasNext()){
            System.out.println("iterator:  "+iterator.next());
        }

        while (listIterator.hasNext()){
            System.out.println("has previous "+listIterator.hasPrevious());
        }


        Map<String, Integer>map = new HashMap<>();   // map<K,V> --- k-- hashcode --- bucket number -- 1st -- k = a (hash code--- bucket no)  2nd k = a (hash code --- bucket no.)

        // btree

        map.put("nitin", 59846);
        map.put("n", 90);


        System.out.println("value   "+map.get("nitin"));
        for (Map.Entry<String, Integer> me : map.entrySet()) {
            System.out.println(me.getValue());
            System.out.println(me.getKey());
        }


        Set<Integer> set = new HashSet<>();

        set.add(9854);    //          set(45) ----> hashmap<k, v>    ---  k ==45   v=PRESENT --- constant   k ==45 hashcode
        set.add(9);
        set.add(98);
        set.add(9);
        System.out.println(set);

        for(Integer in: set){
            System.out.println(in);
        }























    }

}
