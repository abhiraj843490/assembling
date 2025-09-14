package com.abhi_prep.DSA;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FindFirstAndLastPos34 {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10}, tar = 8;
        int ans[] = searchRange(nums, tar);
        for (int a : ans) {
            System.out.println(a);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int ans[] = {-1, -1};
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                if (nums[mid - 1] == target) {
                    ans[0] = mid - 1;
                    ans[1] = mid;
                    break;
                }
                if (nums[mid + 1] == target) {
                    ans[0] = mid;
                    ans[1] = mid + 1;
                    break;
                }
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }


    class A {

        int a, b, c;
        A(){}

        A(int a, int b) {
            this.a = a;
            this.b = b;
        }

    }


    class B extends A {
        A viv = new A(1,2);
//        viv.c = 0;
    }
}


