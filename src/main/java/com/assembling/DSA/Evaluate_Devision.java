package com.assembling.DSA;

import java.util.*;

public class Evaluate_Devision {
    public static void main(String[]args){
        String [][]equations = {{"a","b"},{"b","c"}};
        double []values = {2.0,3.0};
        String [][]queries = {{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}};
        double[] res = calcEquation(equations, values, queries);
        for (double r:res){
            System.out.print(r+" ");
        }
    }

    static double[] calcEquation( String [][]equations, double []values, String [][]queries){
        // 1. build graph
        Map<String, List<Pair>> graph = new HashMap();

        for(int i=0;i<equations.length;i++){
            String u = equations[i][0], v = equations[i][1];
            double value = values[i];
            // put u and v
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            //add next node and value
            graph.get(u).add(new Pair(v, value));
            graph.get(v).add(new Pair(u, 1.0/value));
        }
        double [] ans = new double[queries.length];
        int i=0;
        for(String[] query: queries){
            String src = query[0];
            String dst = query[1];
            ans[i++] = bfs(src, dst, graph);
        }
        return ans;
    }
    static double bfs(String src, String dst, Map<String, List<Pair>> graph){
        //same-same node
        if (!graph.containsKey(src) || !graph.containsKey(dst)) return -1.0;
        if(src.equals(dst)){
            return 1.0;
        }
        Set<String> visited = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(src, 1.0));
        visited.add(src);

        while (!pq.isEmpty()){
            Pair pair = pq.poll();
            String u = pair.node;
            double val = pair.value;
            if(u.equals(dst)){
                return val;
            }
            for(Pair p:graph.get(u)){
                if(!visited.contains(p.node)){
                    visited.add(p.node);
                    pq.offer(new Pair(p.node, val*p.value));
                }
            }

        }
        return -1.0;

    }
}

class Pair{
    String node;
    double value;
    Pair(String node, double value){
        this.value=value;
        this.node=node;
    }
}
