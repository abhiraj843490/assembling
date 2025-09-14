package com.abhi_prep.DSA;

import java.util.Stack;

public class DecodeString {

    public static void main(String[]args) {
        String res = decodeString("2[3[ab]c]");//abababcabababc
        System.out.println(res);
    }

    public static String decodeString(String s) {
        int n = s.length();
        Stack<String> st = new Stack<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c == ']'){
                StringBuilder ss = new StringBuilder();
                while(!st.peek().equals("[")){
                    ss.append(st.pop());
                }
                st.pop();
                int k = Integer.parseInt(st.pop());
                String word = ss.reverse().toString();
                ss = new StringBuilder();
                while(k>0){
                    ss.append(word);
                    k--;
                }
                System.out.println(word+":"+ss.toString());
                st.push(ss.toString());
            }else{
                st.push(""+c);
            }
        }
        String result = "";
        while(!st.isEmpty()){
            result=st.pop() + result;
        }
        return result;
    }
}


