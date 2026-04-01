package com.assembling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test6 {
    public static void main(String[]args){

        int []nums = {11, 15, 7, 2};
        int target = 9;
        int []res = targetsum(nums, target);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }

    static int[] targetsum(int []nums, int tar){
        Map<Integer, Integer>map = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            int diff = tar-nums[i];//9-2=7
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};//{2,3}
            }
            map.put(nums[i],i);//{{11,0},{15, 1}, {7,2},}
        }
        return new int[]{-1,-1};
    }

}

