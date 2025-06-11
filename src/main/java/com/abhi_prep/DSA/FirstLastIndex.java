package com.abhi_prep.DSA;

public class FirstLastIndex {
    public static void main(String[]args){
        int arr[] = {4,5,6,6,6,7,8,9};
        int tar = 6;
        int l=0; int h=arr.length-1;
        int result = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==tar){
                result= mid;
                break;
            }
            else if(arr[mid]<tar){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        System.out.print(result);
    }

}
