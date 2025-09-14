package com.abhi_prep.DSA;

public class MoveZero {
    public static void main(String[]args){
        String s[] = {"asv", "smr", "rmn", "sonu"};
        int arr[] = {34, 5, 0,12,0, 0};//{0,0,0,34,5,12}

        int left=0;
        int right=arr.length-1;

        int arr2[]=new int[arr.length];

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
                count++;
        }

        int p=count;
        p--;

      for(int i=0;i<arr.length;i++){
          if(arr[i]!=0)
          arr2[++p]=arr[i];
      }


        for (int x:arr2){

            System.out.print(x+" ");
        }
    }
}
