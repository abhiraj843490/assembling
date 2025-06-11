package com.abhi_prep.DSA;

public class HillProblem {
    public static void main(String []args){
        int arr[]={12, 13, 14, 17, 20, 80, 90};
        System.out.println(pickPoint(arr));
    }
    static int pickPoint(int arr[]){
        int l=0; int h = arr.length-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid]<arr[mid+1]){
                l=mid;
            }else{
                h=mid;
            }
        }
        return -1;
    }
}
