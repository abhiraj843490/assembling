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
        /*BT
              3
             / \
            1   4
             \  / \
              2 1   5
        */
        /*BST
              5
             / \
            3   8
             \  / \
              4 6   10
                    / \
                   9   12
        */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3, null, new TreeNode(4));
        root.right = new TreeNode(8, new TreeNode(6), new TreeNode(10, new TreeNode(9), new TreeNode(12)));

        GoodNodesBinaryTree sol = new GoodNodesBinaryTree();
        int result = sol.goodNodes(root);

        //lowest common ancestor
        TreeNode p = root.right.left;
        TreeNode q = root.right.right;
        TreeNode res = sol.lca(root, p, q);
        sol.deleteNode(root, 8);
        System.out.println(res.val);

        System.out.println("Number of good nodes: " + result); // Expected: 4
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

    static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            else {
                TreeNode successor = findMin(root.right);
                root.val = successor.val; // replace value
                root.right = deleteNode(root.right, successor.val); // delete successor
            }
        }
        return root;
    }

    static TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

}

