package com.abhi_prep.DSA;

public class LeftEleRight {
    public static void main(String[] args) {
        int arr[] = {8,4, 4, 3, 10, 6};
        int res = findEle(arr);
        System.out.println("resultant: "+res);
    }
    /*
        2 4 3 5 1 = 15
     */
    static int findEle(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];//35
        }
        int ls = 0;
        for(int i=0;i<arr.length-1;i++){
            ls+=arr[i];
            if(ls==sum){
                System.out.println(ls +""+sum);
                return i+1;
            }
            sum-=arr[i];
        }
        return -1;
    }
    /*
        4, 5, 6, 0, 1, 2
     */
}
