package com.abhi_prep.DSA;

import java.util.ArrayList;

public class RotateDelete {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
        System.out.println(rotateDelete(list));
    }
    static int rotateDelete(ArrayList<Integer>list){
        int n = list.size();
        for(int i=0;i<n;i++){
            list.addFirst(list.get(n-1));
            if(i+1<n){
                list.remove(n-(i+1));
            }
            else{
                list.removeFirst();
            }
            n-=1;
        }

        return list.getFirst();
    }
}
