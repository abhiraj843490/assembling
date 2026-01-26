package com.assembling.DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputeDecimal {
    public static void main(String[]args){
        int num = 1000;
        int [] ans = computeDec(num);
        for (int val:ans){
            System.out.println(val);
        }
    }
    static int [] computeDec(int num){
        int prod = 1;
        List<Integer> list=new ArrayList<>();
        while (num>0){
            int rem = num%10;
            if(rem!=0) {
                list.add(rem * prod);
            }
            prod=prod*10;
            num = num/10;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
