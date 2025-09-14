package com.abhi_prep;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;

public class Test {
    public static void main(String[] args) {
        String str = "sushil is a good guys, sushil is a part of ford";
        String[] arr = str.split(" ");
        List<String> list1 = Arrays.asList(arr);

        Map<String, Long> map = list1.stream()
                .collect(groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());



        List<Emp> emp = new ArrayList<>();
        emp.add(new Emp(1, "a", "ce", 340));
        emp.add(new Emp(1, "ab", "ce", 3400));
        emp.add(new Emp(2, "b", "me", 3400));
        emp.add(new Emp(3, "bc", "it", 300));

        Map<String, Long> elist = emp.stream()
                        .collect(groupingBy(Emp::getEdep, Collectors.mapping(
                                                Emp::getEname, Collectors.counting())));

        elist.forEach((dep, name)->{
            System.out.println(dep+" "+name);
        });

        List<String> elistname = emp.stream().map(Emp::getEname).collect(Collectors.toList()).reversed();
        elistname.forEach(System.out::println);

        List<Emp> list = listEmploye(emp);
        for (Emp value : list) {
            System.out.println(value.esalary);
        }


    }

    static List<Emp> listEmploye(List<Emp> emp) {
        List<Emp> list = emp;

        return list;
    }
}

@Setter
@Getter
@AllArgsConstructor
class Emp {
    int eid;
    String ename;
    String edep;
    int esalary;



}
