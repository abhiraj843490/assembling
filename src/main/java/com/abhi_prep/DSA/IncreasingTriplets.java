package com.abhi_prep.DSA;

public class IncreasingTriplets {
    public static void main(String[] args) {
        int arr[] = {4,5,2147483647,1,2};
        boolean ans = increasingTriplet(arr);
        System.out.println(ans);
    }

    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
        return ans >= 3;
    }

}
