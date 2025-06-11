package com.abhi_prep.DSA;

public class LongestSubstring {
    public static void main(String[]args){
        System.out.println(longestSubstring("ababbc", 2));
    }
    public static int longestSubstring(String s, int k) {
        int []frq = new int[26];
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int index=ch[i]-'a';
            frq[index]++;
        }
        boolean valid=true;
        int mxlen=0;
        int start=0;
        for(int end=0;end<ch.length;end++){
            int index=ch[end]-'a';
            if(frq[index]<k && frq[index]>0){
                String str = s.substring(start, end);
                mxlen=Math.max(mxlen, longestSubstring(str, k));
                start=end+1;
                valid = false;
            }
        }
        if(valid){
            return s.length();
        }
        else{
            return Math.max(mxlen, longestSubstring(s.substring(start),k));
        }
    }
}
