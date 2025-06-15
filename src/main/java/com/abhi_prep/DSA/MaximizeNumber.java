package com.abhi_prep.DSA;

public class MaximizeNumber {
    public static void main(String[]args){
        int  num = 11891;
        System.out.println(minMaxDifference(num));
    }
    public static int minMaxDifference(int num) {
        String s1 = Integer.toString(num);
        String s2 = s1;
        int index = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!='9'){
                index = i;
                break;
            }
        }
        if(index<s1.length()){
            s1=s1.replace(s1.charAt(index),'9');
        }
        s2=s2.replace(s2.charAt(0),'0');
        return Integer.parseInt(s1)-Integer.parseInt(s2);

    }
}



