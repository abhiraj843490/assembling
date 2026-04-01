package com.assembling.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[]args){
        int [] arr = {34, 1, 12, 45, 90, 10};
        List<Integer> list = Arrays.stream(arr).boxed().sorted().toList();
        System.out.println(list);

        List<Integer>list2 = Arrays.stream(arr).boxed().sorted(Comparator.comparing(x->x)).toList();
        System.out.println(list2);

        List<Integer>list3 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list3);

        List<Integer>list4 = Arrays.stream(arr).boxed().map(a->a+a).toList();
        System.out.println(list4);

        Integer res = Arrays.stream(arr).boxed().findFirst().get();
        System.out.println(res);

        Integer res1 = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(res1);

        String str = "aabbcdeff";
        List<Character>res3 = str.chars().mapToObj(c->(char)c).toList();
        System.out.println(res3);
        List<Character>res4 = str.chars().mapToObj(c->(char)c).sorted(Comparator.reverseOrder()).toList();
        System.out.println(res4);

        Map<Character, Long>map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(map);
        

    }
}
