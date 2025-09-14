package com.abhi_prep.DSA;

public class EqualPairs2352 {
    public static void main(String[] args) {
//        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        int ans = equalPairs(grid);
        System.out.println(ans);
    }

    public static int equalPairs(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int l = 0; l < n; l++) {
            for (int i = 0; i < m; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (grid[l][j] == grid[j][i]) {
                        count++;
                    }
                }
                if (count == n) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
