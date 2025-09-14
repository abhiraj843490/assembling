package com.abhi_prep.DSA;

import lombok.*;

import java.util.*;

class Anagram {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Student{
        private String name;
        private String email;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println(ans.toString());
        Student student1 = new Student("skp", "skp@gmail.com");
        Student student2 = new Student("sk", "sk@gmail.com");
        List<Student> asList = Arrays.asList(student1,student2);
//        List<Student> listOf = List.of(student1, student2);
        asList.add(0, student2);
//        listOf.get(0).setEmail("skr@gmail.com");
        List<Integer> listOf = List.of(1,2,3,4);
        listOf.add(0, 3);
//        asList.add(student1);
//        listOf.add(student1);

        System.out.println(asList);
        System.out.println(listOf);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> mp = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();
        int i=0;
        for (String st : strs) {
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String t = "";
            for (char c : ch) {
                t += c;
            }
            if (mp.containsKey(t)) {
                int ind = mp.get(t);
                ans.get(ind).add(st);
            }else{
                mp.put(t, mp.getOrDefault(t,i++));
                List<String> list = new ArrayList<>();
                list.add(st);
                ans.add(list);
            }
        }
        return ans;
    }
}
