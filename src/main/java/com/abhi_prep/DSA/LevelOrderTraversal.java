//package com.abhi_prep.DSA;
//
//import java.util.*;
//
//class TreeNode {
//    int val;
//    TreeNode1 left, right;
//    TreeNode(int val) {
//        this.val = val;
//    }
//}
//
//public class LevelOrderTraversal {
//
//    public static List<List<Integer>> levelOrder(TreeNode1 root) {
//        Queue<TreeNode1> q = new LinkedList<>();
//        List<List<Integer>> finalAns = new ArrayList<>();
//
//        if (root == null) {
//            return finalAns;
//        }
//
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            int levels = q.size();
//            List<Integer> subLevels = new ArrayList<>();
//
//            for (int i = 0; i < levels; i++) {
//                if (q.peek().left != null) {
//                    q.add(q.peek().left);
//                }
//                if (q.peek().right != null) {
//                    q.add(q.peek().right);
//                }
//                subLevels.add(q.remove().val);
//            }
//            finalAns.add(subLevels);
//        }
//
//        return finalAns;
//    }
//
//    public static void main(String[] args) {
//        // Build sample binary tree:
//        //        1
//        //       / \
//        //      2   3
//        //     / \   \
//        //    4   5   6
//
//        TreeNode1 root = new TreeNode1(1);
//        root.left = new TreeNode1(2);
//        root.right = new TreeNode1(3);
//        root.left.left = new TreeNode1(4);
//        root.left.right = new TreeNode1(5);
//        root.right.right = new TreeNode1(6);
//
//        List<List<Integer>> result = levelOrder(root);
//
//        // Print the result
//        for (List<Integer> level : result) {
//            System.out.println(level);
//        }
//    }
//}
//
