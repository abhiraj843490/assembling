package com.abhi_prep.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(23, "Abhi");
        Employee emp2 = new Employee(230, "Sahil");
        Employee emp3 = new Employee(203, "Anu");
        Employee emp4 = new Employee(231, "Swati");
        Employee emp5 = new Employee(2, "Soni");

        // Adding employees to a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        // Sorting the list of employees
        Collections.sort(employees);

        // Printing the sorted list
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(Employee employee) {
        return employee.name.compareTo(this.name);
//        if(this.id>o.id){
//            return -1;
//        }
//        else if(this.id<o.id){
//            return 1;
//        }
//        return 0;
    }
}
