package com.assembling.DSA;

public class MyPow {
    public static void main(String[]args){
        double x = 2.00; int n = -200000000;
        double ans = myPow(x,n);
        System.out.println(ans);
    }

    public static double myPow(double x, int n) {
        int num = Math.abs(n);
        if(n==0 && x>=1){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n==1){
            return x;
        }
        if(n<0){
            x=1/x;
        }
        double ans = x*myPow(x, (int)(num-1));
        if(n<0){
            return 1/ans;
        }
        return ans;
    }
}
