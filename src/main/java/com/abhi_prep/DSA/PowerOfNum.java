package com.abhi_prep.DSA;

public class PowerOfNum {
    public static void main(String[]args){
        System.out.println(power(2,0));
        System.out.println(isPowerOfTwo(4));
    }

    static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        if(pow ==1 ){
            return num;
        }
        return num*power(num, pow-1);
    }
    static boolean isPowerOfTwo(int num){
        if(num==0){
            return false;
        }
        if(num==1){
            return true;
        }

        return num%2==0 && isPowerOfTwo(num/2);
    }
}
