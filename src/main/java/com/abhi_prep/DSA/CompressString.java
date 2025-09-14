package com.abhi_prep.DSA;

import java.util.Stack;

public class CompressString {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        System.out.println(compress(chars));
    }


    static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        Stack<Character> st = new Stack<>();
        for (int i = chars.length - 1; i >= 0; i--) {
            st.push(chars[i]);
        }
        int j = 1, count = 0;
        while(!st.isEmpty()){
            char ch = st.pop();
            if (ch == chars[j - 1]) {
                count++;
            } else {
                if (count != 1) {
                    String valStr = Integer.toString(count);
                    for (char c : valStr.toCharArray()) {
                        chars[j++] = c;
                    }
                }
                chars[j++] = ch;
                count = 1;
            }
        }
        if (count != 1) {
            String valStr = Integer.toString(count);
            for (char c : valStr.toCharArray()) {
                chars[j++] = c;
            }
        }
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+" ");
        }

        return j;

    }
}
