package com.abhi_prep.DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr);
        for (int j : arr) System.out.print(j + " ");
    }

    static void rearrange(int arr[]) {
        ArrayList<Integer> plist = new ArrayList<>();
        ArrayList<Integer> nlist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                plist.add(arr[i]);
            } else {
                nlist.add(arr[i]);
            }
        }
        int i = 0, j = 0;
        int k = 0;
        while (i < plist.size() && j < nlist.size()) {
            arr[k++] = plist.get(i++);
            arr[k++] = nlist.get(j++);
        }
        while (j < nlist.size()) {
            arr[k++] = nlist.get(j++);
        }
        while (i < plist.size()) {
            arr[k++] = plist.get(i++);
        }

    }
}
