package com.assembling.lamdbaPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(8,8,1, 2,9,9,9);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get());


    }
}
