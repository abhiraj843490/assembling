package com.abhi_prep.DSA;

import java.util.*;

class TreeNode1 {
    int val;
    TreeNode1 left, right;

    TreeNode1(int v) {
        this.val = v;
    }
}

public class BST {
    public static TreeNode1 insertIntoBST(TreeNode1 root, int val) {
        if (root == null){
            return new TreeNode1(val);
        }
        if (val < root.val){
            root.left = insertIntoBST(root.left, val);
        }
        else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public static TreeNode1 deleteIntoBST(TreeNode1 root, int val) {
        if(root==null){
            return null;
        }
        if(val>root.val){
            root.right=deleteIntoBST(root.right, val);
        } else if (val< root.val) {
            root.left=deleteIntoBST(root.left, val);
        }else{
            if(root.left==null){
                root = root.right;
            }
            if(root.right==null){
                root = root.left;
            }
        }
        return root;
    }

    // Build a BST from an array of values (insertion order)
    public static TreeNode1 buildBST(int[] nums) {
        TreeNode1 root = null;
        for (int x : nums){
            root = insertIntoBST(root, x);
        }
        return root;
    }

    // Inorder traversal (should be sorted for a BST)
    public static void printInorder(TreeNode1 root) {
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
    }

    private static void inorder(TreeNode1 node) {
        if (node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    // Level-order (BFS) traversal
    public static void printLevelOrder(TreeNode1 root) {
        System.out.print("Level order: ");
        if (root == null) {
            System.out.println("(empty)");
            return;
        }
        Queue<TreeNode1> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode1 n = q.poll();
            System.out.print(n.val + " ");
            if (n.left != null) q.offer(n.left);
            if (n.right != null) q.offer(n.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initial BST from values
        int[] initial = {4, 2, 7, 1, 3};
        TreeNode1 root = buildBST(initial);

        System.out.println("Initial tree:");
        printInorder(root);
        printLevelOrder(root);
        int deleteval = 1;
        root = deleteIntoBST(root, deleteval);

        // Insert a value
        int insertVal = 5;
        System.out.println("\nInserting: " + insertVal);
        root = insertIntoBST(root, insertVal);
        System.out.println("After insert:");
        printInorder(root);
        printLevelOrder(root);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nEnter values to insert (space-separated), then Enter:");
//        while (sc.hasNextInt()) {
//            int v = sc.nextInt();
//            root = insertIntoBST(root, v);
//        }
//        sc.close();
//
//        System.out.println("\nAfter all inserts:");
//        printInorder(root);
//        printLevelOrder(root);

    }
}
