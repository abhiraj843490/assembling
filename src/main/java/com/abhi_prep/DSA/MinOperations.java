package com.abhi_prep.DSA;

import java.util.HashMap;
/*
            W B B W W B B W B W
            W B B W W B B = 7
            Map {W=3, B=4}-o=3
            B B W W B B W = 7
            Map {W=3, B=4}-o=3
            B W W B B W B = 7
            Map {W=3, B=4}-o=3   mn = 3
            W W B B W B W = 7
            Map {W=4, B=3}-o=4   mn = 3
        */

public class MinOperations {
    public static void main(String[]args){
        String blocks = "WBBWWBBWBW"; int k = 7;
        System.out.println(minimumRecolors(blocks, k));
    }
    public static int minimumRecolors(String blocks, int k) {
        int end = blocks.length();
        int cw =0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                cw++;
            }
        }
        int mnopr = cw;
        for(int i=k;i<end;i++){
            if(blocks.charAt(i)=='W'){
                cw++;
            }if(blocks.charAt(i-k)=='W'){
                cw--;
            }
            mnopr=Math.min(cw,mnopr);
        }
        return mnopr;

    }

}

