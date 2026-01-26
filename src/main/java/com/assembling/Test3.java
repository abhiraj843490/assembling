package com.assembling;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    //    Task:
//            - Draw histogram created from a list of numbers.
//            - It sorts them into N number of classes, all with the same WIDTH.
//            - The first class is for any number smaller than MIN, and the last class is for any number larger than MIN + (N - 2) × WIDTH.
//- The classes in between cover a range of numbers equal to the WIDTH.
//- N, WIDTH, and MIN are parameters.
//    For example, when using the following parameters:
//            - N = 5
//            - WIDTH = 10
//            - MIN = 50
//    You'll get the following histogram.
//            *
//            *
//            *
//            *     *
//            *  *     *
//            *  *     *  *
//            *  *  *  *  *
//            *  *  *  *  *
//            *  *  *  *  *
//            *  *  *  *  *
//            *  *  *  *  *
//            *  *  *  *  *
//            ---------------
//            8 12  6  9  7
//
//
//    DATA = "45.1, 46.2, 47.3, 48.4, 49.5, 41.0, 43.5, 47.9, 51.0, 52.3, 53.4, 54.5, 55.6, " +
//            "56.7, 57.8, 58.9, 50.1, 51.5, 52.8, 54.1, 61.1, 63.2, 65.3, 67.4, 68.5, 60.9, " +
//            "70.1, 71.2, 72.3, 73.4, 74.5, 75.6, 76.7, 77.8, 78.9, 81.1, 85.2, 89.3, 93.4, " +
//            "97.5, 102.0, 105.5";


    public static void main(String[]args){
            String data = "45.1, 46.2, 47.3, 48.4, 49.5, 41.0, 43.5, 47.9, 51.0, 52.3, 53.4, 54.5, 55.6, " +
            "56.7, 57.8, 58.9, 50.1, 51.5, 52.8, 54.1, 61.1, 63.2, 65.3, 67.4, 68.5, 60.9, " +
            "70.1, 71.2, 72.3, 73.4, 74.5, 75.6, 76.7, 77.8, 78.9, 81.1, 85.2, 89.3, 93.4, " +
            "97.5, 102.0, 105.5";
            int n=5;
            int min = 50;
            int wid = 10;

         List<Integer> ans = histogram(data, n, min, wid);
        System.out.println(ans);

        String s = "abhc";
        System.out.println(s.substring(1));
    }

    static List<Integer> histogram(String data, int n, int min, int wid){

        List<Integer>ans = new ArrayList<>();
        List<Double> val = new ArrayList<>();
        for(String s : data.split(",+")){
            val.add(Double.parseDouble(s));
        }
        int max = min+(n-2)*wid;
        for(int i=0;i<n;i++){
            int start, end;
            if(i==0){
                start=0;
                end=min;
            }else if(i==n-1){
                start=max;
                end=Integer.MAX_VALUE;
            }else{
                start = min + (i*wid);
                System.out.println("start "+ start);
                end = start+wid;
                System.out.println("end "+ end);
            }
            int count =0;
            for(double v: val){
                if(v>=start && v < end){
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }

}
