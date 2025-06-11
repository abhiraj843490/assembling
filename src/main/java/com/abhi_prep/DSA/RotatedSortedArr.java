package com.abhi_prep.DSA;

public class RotatedSortedArr {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        System.out.println(binarySearch(arr, key));
    }

    static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < arr[0]) {
                if (key <= arr[high] && key > arr[mid]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            } else {
                if (key >= arr[low] && key < arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }

            }
        }
        return -1;

    }
}
