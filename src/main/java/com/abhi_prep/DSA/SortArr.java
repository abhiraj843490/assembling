package com.abhi_prep.DSA;

import java.util.Arrays;

public class SortArr {
    public static void main(String [] args) {
        int arr[] = {34, 2, 20, 6, 8, 90};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
