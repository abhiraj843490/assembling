package com.abhi_prep.DSA;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayList;

public class TopFrequentStrings {
    public static void main(String []args){
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        List<String> result = topKFrequent(words, k);
        System.out.println(result);
    }
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer>mp = new HashMap<>();
        for (String word : words) {
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Integer>mxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int val:mp.values()){
            mxheap.add(val);
        }

        List<String> result = new ArrayList<>();
        for(int i=0;i<k;i++){
            int topval = mxheap.poll();

                for(String key:mp.keySet()) {
                    if(mp.get(key)==topval){
                        result.add(key);
                        mp.remove(key);
                    }
                }

        }
        return result;
    }
}
