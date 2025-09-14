package com.abhi_prep.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String [] args){
        TreeSet<String> set = new TreeSet(new CustomSorting());
        set.add("abhiraj");
        set.add("raj");
        set.add("anu");
        set.add("swati");
        set.add("soni");
        System.out.println(set);
    }
}

class CustomSorting implements Comparator {
    @Override
    public int compare(Object f, Object s){
        String p = (String)f;
        String d = (String)s;
        return d.compareTo(p);

    }

}

