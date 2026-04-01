package com.assembling;

import org.springframework.cache.annotation.Cacheable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Test5 {
    /*
    Input: nums = [0,0,0]
target sum = 0
// -4 -1 -1 0 1 2
Output: [[-1,-1,2],[-1,0,1]]
     */

    public static void main(String[] args) {
        int nums[] = {-1, 2, 1, -4};
        int target = 2;
//        List<List<Integer>>res = tripletSum(nums, target);

//        for(int i=0;i<res.size();i++){
//            System.out.println(res.get(i));
//        }

        System.out.println(tripletSum(nums, target));
    }

    static int tripletSum(int[] nums, int tar) {
        int n = nums.length;
        Arrays.sort(nums);
        int closetSum = nums[0] + nums[1] + nums[2];

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - tar) < Math.abs(closetSum - tar)) {
                    closetSum = sum;
                }
                if (sum < tar) l++;
                else if (sum > tar) r--;
                else {
                    return sum;
                }

//                if(sum==tar){
//                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
//                    l++;
//                    r--;
//                    while (l<r && nums[l]==nums[l-1]) l++;
//                    while (l<r && nums[r]==nums[r+1]) r--;
//                }else if(sum<tar){
//                    l++;
//                }else{
//                    r--;
//                }
            }
        }
        return closetSum;
    }
}
