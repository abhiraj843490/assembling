package com.abhi_prep.DSA;

import java.util.PriorityQueue;
import java.util.Stack;

public class SmallestLexicographic {
    public static void main(String[]args){
        String s = "aab*ac";
        System.out.println(clearStars(s));
    }
    static String clearStars(String s) {
        if(!s.contains("*")){
            return s;
        }
        StringBuilder res = new StringBuilder();
        PriorityQueue<Character> pq= new PriorityQueue<>();
        for (char c : s.toCharArray()) {
            if (c != '*') {
                res.append(c);
                pq.offer(c);
//            } else if (!pq.isEmpty()) {
//                char minChar =pq.poll();
//                res.deleteCharAt(res.lastIndexOf(String.valueOf(minChar)));
            }
        }
        return res.toString();
    }
}
