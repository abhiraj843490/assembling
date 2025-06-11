package com.abhi_prep.DSA;
import java.util.LinkedHashMap;

public class StrToArr {
    public static void main(String[] args) {
        String s = "abhiraj"; // aa, b, h, i, r, j
        // output: e e e
        //         n n n
        //         g g
        //         i i
        //         r

        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        int[][] res = new int[mp.size()][];
        int index = 0;
        for (char key : mp.keySet()) {
            res[index] = new int[mp.get(key)];
            for (int j = 0; j < mp.get(key); j++) {
                res[index][j] = key;
            }
            index++;
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print((char) res[i][j] + " ");
            }
            System.out.println();
        }
    }
}