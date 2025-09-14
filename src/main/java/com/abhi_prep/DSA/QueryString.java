package com.abhi_prep.DSA;

public class QueryString {
    public static void main(String[]args){
        boolean res = queryString("110101011011000011011111000000", 15);
        System.out.println(res);
    }
    public static boolean queryString(String s, int n) {
        int low = 1, high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            String binary = binaryConvert(mid);
            if(s.contains(binary)){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return high>=n;
    }

    public static String binaryConvert(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n = n>>1;
        }
        return sb.reverse().toString();
    }
}




