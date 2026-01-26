package com.assembling.config;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

//    A a = new A();
    public static void main(String[]args){
        int a[] = {23, 45, 45, 7, 9};
        //o/p: {23, 45, 7, 9}
        //45x7x9
        //23x7x9
        //23x45x9
        //23x45x7

        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        //o/p: {23, 45, 7, 9}
        int k = 0;
        int ans[] = new int[set.size()+1];
        List<Integer> list  = set.stream().toList();
        for(int j=0;j<list.size();j++){
            int prod = 1;
            for(int i=0;i<list.size();i++) {
                if ( list.get(j)!= list.get(i)) {
                    prod*=list.get(i);
                }
            }
            ans[k++]=prod;
        }

        for(int i=0;i<list.size();i++){
            System.out.println(ans[i]);
        }

        List<Employee>employeeList = new ArrayList<>();
        employeeList.add(new Employee("abhi", 3450, "IT"));
        employeeList.add(new Employee("soni", 6000, "MED"));
        employeeList.add(new Employee("sahil", 5500, "MED"));
        employeeList.add(new Employee("rahul", 4875, "ME"));

        Optional<Integer> result = employeeList.stream().map(employee -> employee.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("salary : "+result.get());

        Map<String, List<Employee>> gEmp = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.dep));

        for(Map.Entry entry: gEmp.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

        Map<String, Double> gdep = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.dep
                ,Collectors.averagingInt(value -> value.salary)));

        for(Map.Entry entry: gdep.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }



    }
}
class Employee{
    String name;
    int salary;
    String dep;
    Employee(String name, int salary, String dep){
        this.name=name;
        this.dep=dep;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setDep(String dep){
        this.dep=dep;
    }

}
