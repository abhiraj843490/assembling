package com.abhi_prep.DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagrams {

    public static void main(String[]args){
        String  s = "cbaebabacd", p = "abc";
        List<Integer> ans = findAnagrams(s,p);
        System.out.println(ans.toString());

    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {  // p annot be longer than s
            return ans;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (sMap.equals(pMap)) {
            ans.add(0);     // add the first index
        }

        int l = 0, r = p.length();
        while (r < s.length()) {
            char acquire = s.charAt(r++);   // r moves ahead
            sMap.put(acquire, sMap.getOrDefault(acquire, 0) + 1);
            char discard = s.charAt(l++);   // l moves ahead
            sMap.put(discard, sMap.get(discard) - 1);
            if (sMap.get(discard) == 0) {
                sMap.remove(discard);
            }
            if (sMap.equals(pMap)) {
                ans.add(l);  // add the left bound of the window
            }
        }
        return ans;
    }
}
