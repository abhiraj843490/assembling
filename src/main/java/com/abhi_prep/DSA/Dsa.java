package com.abhi_prep.DSA;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dsa {
    public static void main(String[]args){
        long[] arr = {4, 3, 2, 6};

        long res = minCost(arr);
        System.out.println(res);
    }
    static long minCost(long [] arr){                    // 5+9+15=29
        PriorityQueue<Long> q = new PriorityQueue<>();  // 2 3 4 6 --4 5 6 -- 9 6 -- 15
        ArrayList<Long>list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            q.offer(arr[i]);
        }
        while (!q.isEmpty()){
            long t1 = q.poll();
            if(!q.isEmpty()){
                long t2 = q.poll();
                long sum = t1+t2;
                list.add(sum);
                q.offer(sum);
            }
            else{
                break;
            }
        }
        long res = 0;
        for(int k=0;k<list.size();k++){
            res+=list.get(k);
        }
        return res;
    }
}
