package com.abhi_prep.DSA;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class GoodNodesBinaryTree {

    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int maxSoFar) {
        if (node == null) {
            return 0;
        }

        int good = 0;
        int v = node.val;
        if (v >= maxSoFar) {
            good = 1;
        }

        maxSoFar = Math.max(maxSoFar, v);

        int left = dfs(node.left, maxSoFar);
        int right = dfs(node.right, maxSoFar);

        return good + left + right;
    }

    public static void main(String[] args) {
        /*
              3
             / \
            1   4
             \  / \
              2 1   5
        */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1, null, new TreeNode(2));
        root.right = new TreeNode(4, new TreeNode(1), new TreeNode(5));

        GoodNodesBinaryTree sol = new GoodNodesBinaryTree();
//        int result = sol.goodNodes(root);

        //lowest common ancestor
        TreeNode p = root.right.left;
        TreeNode q = root.right.right;
        TreeNode res = sol.lca(root, p, q);
        System.out.println(res.val);

//        System.out.println("Number of good nodes: " + result); // Expected: 4
    }

    static TreeNode lca(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }

        // If current node is one of p or q, return it
        if (node == p || node == q) {
            return node;
        }

        TreeNode left = lca(node.left, p, q);
        TreeNode right = lca(node.right, p, q);

        // If both left and right are non-null, current node is LCA
        if (left != null && right != null) {
            return node;
        }

        // Otherwise return whichever side is non-null
        return left != null ? left : right;
    }
}

