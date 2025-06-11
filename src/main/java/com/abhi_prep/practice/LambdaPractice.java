package com.abhi_prep.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaPractice {
    public static void main(String[]args){
        List<String>list = Arrays.asList("abhi","sahil", "mohan");

        Stream st = list.stream().filter(s -> s.startsWith("a"));
        st.forEach(System.out::println);
    }
}
