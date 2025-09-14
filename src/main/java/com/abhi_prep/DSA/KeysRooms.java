package com.abhi_prep.DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class KeysRooms {
    public static void main(String[]args){
        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1)
        );
        boolean res = canVisitAllRooms(rooms);
        System.out.println(res);
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[rooms.size()];
        vis[0]=true;

        for(int i=0;i<rooms.get(0).size();i++){
            st.push(rooms.get(0).get(i));
        }
        int c=1;

        while(!st.isEmpty()){
            if(vis[st.peek()]==false){
                int inx = st.pop();
                c++;
                vis[inx]=true;
                for(int i=0;i<rooms.get(inx).size();i++){
                    st.push(rooms.get(inx).get(i));
                }
            }else{
                st.pop();
            }
        }
        if(c!=rooms.size()){
            return false;
        }
        return true;
    }
}
