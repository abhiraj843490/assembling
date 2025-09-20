package com.abhi_prep.DSA;

import java.util.PriorityQueue;

public class TotalCostToHireKWorkers2462 {
    public static void main(String[] args) {
        int k = 11, candidates = 2;
//        int costs[] = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        int costs[] = {31, 25, 72, 79, 74, 65, 84, 91, 18, 59, 27, 9, 81, 33, 17, 58};
        long ans = totalCost(costs, k, candidates);
        System.out.println(ans);
    }

    public static long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length-1;
        PriorityQueue<Integer> h1 = new PriorityQueue<>();
        PriorityQueue<Integer> h2 = new PriorityQueue<>();

        int i = 0;
        for (int x = 0; x < candidates && i <= n; x++) {
            h1.add(costs[i++]);
        }
        for (int x = 0; x < candidates && i <= n; x++) {
            h2.add(costs[n--]);
        }
        long ans = 0;
        for (int h = 0; h < k; h++) {
            int v1 = h1.isEmpty() ? Integer.MAX_VALUE : h1.peek();
            int v2 = h2.isEmpty() ? Integer.MAX_VALUE : h2.peek();
            if (v1 <= v2) {
                ans += h1.poll();
                if (i <= n) {
                    h1.add(costs[i++]);
                }
            } else {
                ans += h2.poll();
                if (i <= n) {
                    h2.add(costs[n--]);
                }
            }
        }
        return ans;
    }
}
