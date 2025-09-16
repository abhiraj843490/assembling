package com.abhi_prep.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 4, 46, 8);
        list.stream().forEach(System.out::println);

        //create a array using Arrays stream
        Integer[] arr = {23, 45, 12, 2, 40, 24};
        Stream<Integer> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        //create infinite stream using stream iterator
        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);

        //given a list of string, print only those string who is start with a
        String[] str = {"sahil", "abhiraj", "abhi"};
        List<String> strList = Arrays.asList(str);
        List<String> ans = strList.stream().filter(n -> n.startsWith("a")).toList();
        ans.forEach(System.out::println);

        //given list of integer, return list of squares of their elements
        List<Integer> ans1 = list.stream().map(n -> n * n).toList();
        ans1.forEach(System.out::println);

        //list of string, convert them in uppercase
        strList.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

        //count even number in list
        long count = list.stream().filter(n->n%2==0).count();
        System.out.println(count);

        //find min max from list
        int min = list.stream().min(Comparator.comparing(a->a)).get();
        int min1 = list.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println(min +"  " + min1);

        //check any string is strat with s with anymatch
        boolean bool = strList.stream().anyMatch(s->s.startsWith("s"));
        System.out.println(bool);

        //convert a list to set using stream
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        set.stream().forEach(System.out::println);

        String string = strList.stream().collect(Collectors.joining(","));
        System.out.println(string);

    }
}
