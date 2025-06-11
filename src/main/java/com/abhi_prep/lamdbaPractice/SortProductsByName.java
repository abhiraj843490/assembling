package com.abhi_prep.lamdbaPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Problem: Given a list of Sample objects, sort the list by state name in alphabetical order.
*/
public class SortProductsByName {
    public static void main(String[] args) {
        State state1 = new State("a", 87689);
        State state2 = new State("ba", 87609);
        State state3 = new State("cb", 87699);
        State state4 = new State("aaa", 87699);
        State state5 = new State("aaa", 87699);
        List<State> list = new ArrayList<>();
        list.add(state1);
        list.add(state2);
        list.add(state3);
        list.add(state4);
        list.add(state5);

        List<State> states = list.stream().sorted(Comparator.comparing(State::name)).toList();
        System.out.println("sorted states: "+states);

        State val = list.stream().sorted(Comparator.comparing(State::pinCode).reversed()).skip(1).findFirst().get();
        System.out.println("2nd largest pin code :" + val.pinCode());

        Map<State, Long> keyVal = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("key value pair: " + keyVal);

        List<String> name = list.stream().map(State::name).filter(state -> state.startsWith("a")).toList();
        System.out.println(name);

    }
}

record State(String name, int pinCode) {
}

