package com.abhi_prep.DSA;

class Point {
    int x, y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public boolean validPair(Point p){
        return this.x >= p.x && this.y <= p.y;
    }

    public boolean validRange(Point[] arr, Point p){
        for (Point other : arr) {
            if ((other.x == this.x && other.y == this.y) ||
                    (other.x == p.x && other.y == p.y)) {
                continue;
            }
            if (this.x <= other.x && other.x <= p.x &&
                    this.y <= other.y && other.y <= p.y) {
                return false;
            }
        }
        return true;
    }
}

public class NumberOfWays {
    public static void main(String args[]){
        int[][] arr = { {0,1}, {1,3}, {6,1} };
        int res = numberOfPairs(arr);
        System.out.println(res);
    }

    public static int numberOfPairs(int[][] points) {
        int n = points.length;
        Point[] arr = new Point[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = new Point(points[i][0], points[i][1]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Point a = arr[i];
                Point b = arr[j];
                if (a.validPair(b) && a.validRange(arr, b)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
