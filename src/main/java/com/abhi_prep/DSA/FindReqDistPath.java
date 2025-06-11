package com.abhi_prep.DSA;

public class FindReqDistPath {
    public static void main(String[]args){
        char [][] arr = {
                {'D',	'D',	'L',	'R'},
                {'D',	'L',	'D',	'R'	},
                {'R',	'D',	'L',	'R'},
                {'D',	'L',	'D',	'R'	}
        };
        int n = arr.length-1;
        int m = arr[0].length-1;
        int x=0; int y = 0;
        int X=3; int Y = 1;

        while (x<n && y<m && x>=0 && y>=0 ){
                if(arr[x][y]=='U'){
                    y++;
                }
                else if(arr[x][y]=='D'){
                    x++;
                }
                else if(arr[x][y]=='L'){
                    x++;
                }
                else if(arr[x][y]=='R'){
                    y++;
                }else {
                    x++; y++;
                }

                if(x==X && y==Y){
                    System.out.println("matched");
                    return;
                }

            }
        }


}
