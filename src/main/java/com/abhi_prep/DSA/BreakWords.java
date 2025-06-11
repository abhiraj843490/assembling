package com.abhi_prep.DSA;
import java.util.*;

public class BreakWords {
    public static void main(String[]args){
        System.out.println(wordBreak("leetcode", Arrays.asList("leet","code")));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length()];
        for(int i  = 0 ;i<s.length();i++){
            for(String word : wordDict){

                if(i < word.length() -1) continue;
                int start = i - word.length();

                if( i == word.length() -1 || dp[start]){
                    if(s.substring(start+1 , i+1 ).equals(word)) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[s.length()-1];
    }
}
