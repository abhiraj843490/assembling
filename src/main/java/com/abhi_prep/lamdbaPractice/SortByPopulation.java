package com.abhi_prep.lamdbaPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Problem: Given a list of Sample objects representing different cities with their populations,
         sort the list by population in ascending order.*/

public class SortByPopulation {
    public static void main(String[] args) {

        City city1 = new City("b", 86778);
        City city2 = new City("a", 8678);
        City city3 = new City("c", 86700);
        City city4 = new City("d", 867790);
        List<City> list = new ArrayList<>();
        list.add(city1);
        list.add(city2);
        list.add(city3);
        list.add(city4);

        List<City> cities = list.stream().sorted(Comparator.comparing(City::population)).toList();

        System.out.println("sorted city based on the population: " + cities);

        int res = list.stream()
                .sorted(Comparator.comparing(City::population).reversed()).
                map(City::population).skip(2).findFirst().get();

        System.out.println("3rd largest population: "+res);

        /*
          1.  Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
         */
        ArrayList<Integer> l = new ArrayList<>(); l.add(578); l.add(9485); l.add(90); l.add(980);
        List<Integer> incList = l.stream().filter(num->num%2==0).toList();
        List<Integer>decList = l.stream().filter(num->num%2!=0).toList();

        /*
            2. Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.
         */
        ArrayList<Integer> ll = new ArrayList<>(); ll.add(578); ll.add(9485); ll.add(90); ll.add(9485);
        List<Integer>nonDupList = ll.stream().distinct().toList();

        /*
            3. Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.
         */
        String s = "abhiraj";
        char[] arr = s.toCharArray();
        List<char[]>clist = Arrays.asList(arr);

        Map<Integer, Long> frq = ll.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("frequency :"+frq);

        /*
            4. 2nd largest
         */
        List<Integer>lll = Arrays.asList(56, 345, 10987);
        int secLarg  = lll.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second largest value :"+secLarg);



    }
}

record City(String name, int population) {

}