package com.abhi_prep.DSA;

import java.util.*;

public class PascalTriangle {
    public static void main(String[]args){
        List<List<Integer>>res = new ArrayList<>();
        int numRows = 5;
        res = generate(numRows);
        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> generate(int n){
        int a[][]=new int[n][];
        for(int i=0;i<n;i++){
            a[i]=new int[i+1];
            a[i][0]=1;
            a[i][i]=1;
            for(int j=1;j<i;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(a[i][j]);
            }
            res.add(temp);
        }


        return res;
    }

}
