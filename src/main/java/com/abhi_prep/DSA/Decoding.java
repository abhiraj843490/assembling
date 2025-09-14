package com.abhi_prep.DSA;

import java.util.Stack;

public class Decoding {
    public static void main(String[]args){
        String s = "100[leetcode]";
        String res =  decodeString(s);//"ab2[cd]
        System.out.println(res);
    }
    public static String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        String res = "";

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } else {
                sb.setLength(0); // clear
                while (st.peek() != '[') {
                    sb.append(st.pop());
                }
                sb.reverse(); // fix order
                st.pop(); // remove '['

                // Get the repeat count (handle multi-digit numbers)
                StringBuilder num = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.append(st.pop());
                }
                num.reverse();
                int val = Integer.parseInt(num.toString());

                // Repeat the decoded part and push back to stack
                String repeated = sb.toString().repeat(val);
                for (char c : repeated.toCharArray()) {
                    st.push(c);
                }
            }
        }

        // Build final result from stack
        StringBuilder t = new StringBuilder();
        while (!st.isEmpty()) {
            t.append(st.pop());
        }
        return t.reverse().toString();
    }

}
