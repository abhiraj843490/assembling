package com.abhi_prep.lamdbaPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class PracticeDemo {
    public static void main(String[]args){

        String str = "java is very easy";

        Map<Character, Long> map = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue()));


        System.out.println(map);

        List<String> res = str.chars().mapToObj(c->(char)c).sorted(Comparator.reverseOrder())
                .map(String::valueOf).collect(Collectors.toList());

        System.out.println(res);

    }
}
