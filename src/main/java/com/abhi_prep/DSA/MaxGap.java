package com.abhi_prep.DSA;

public class MaxGap {
    public static void main(String[]args){
        int [] nums = {3,6,9,1};
        int gap = maximumGap(nums);
        System.out.println(gap);
    }

    static int maximumGap(int [] nums){
        quicksort(nums, 0, nums.length-1);
        for (int num:nums)
        {System.out.println(num);}
        int maxsub = 0;
        for(int i=0;i<nums.length-1;i++){
            int sub = nums[i+1]-nums[i];
            maxsub = Math.max(maxsub, sub);
        }
        return maxsub;
    }
    static void quicksort(int []nums, int low, int high){
        if(low>high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int piv = nums[mid];
        while (start<=end){
            while (nums[start]<piv){
                start++;
            }
            while (nums[end]>piv){
                end--;
            }
            if(start<=end){
                swap(nums, start, end);
                start++; end--;
            }
        }
        quicksort(nums, low, end);
        quicksort(nums, start, high);
    }
    static void swap(int[] nums, int s, int e){
        int t = nums[s];
        nums[s]=nums[e];
        nums[e]=t;
    }
}
