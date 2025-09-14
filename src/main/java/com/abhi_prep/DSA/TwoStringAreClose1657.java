package com.abhi_prep.DSA;

import java.util.HashMap;
import java.util.Iterator;

public class TwoStringAreClose1657 {
    public static void main(String[]args){
//        String w1 = "cabbba", w2="aabbss";
//        String w1 = "cabbba", w2="abbccc";
        String w1 = "abbzzca", w2="babzzcz";

        boolean res = closeStrings(w1,w2);
        System.out.println(res);
    }

    public static boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if(m!=n){
            return false;
        }
        HashMap<Character, Integer>mw1 = new HashMap<>();
        HashMap<Character, Integer>mw2 = new HashMap<>();
        for(int i=0;i<n;i++){
            mw1.put(word1.charAt(i), mw1.getOrDefault(word1.charAt(i),0)+1);
            mw2.put(word2.charAt(i), mw2.getOrDefault(word2.charAt(i),0)+1);
        }
        int count=0;
        for(char ch:mw1.keySet()){
            int val=mw1.get(ch);
            if(mw2.containsKey(ch)) {
                Iterator<Character> it = mw2.keySet().iterator();
                while (it.hasNext()) {
                    char c = it.next();
                    int v = mw2.get(c);
                    if (val == v) {
                        count++;
                        mw2.replace(c,mw2.get(ch));
                        mw2.replace(ch, v);
                        break;
                    }
                }
            }
        }
        System.out.println(count);
        return m==n && count==mw1.size()?true:false;
    }

}
