package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q606ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        recursiveTree2str(root, sb);

        return sb.toString();

    }

    void recursiveTree2str(TreeNode root, StringBuilder sb) {
        sb.append(root.val);
        if (root.left == null) {
            if (root.right != null) {
                sb.append("()(");
                recursiveTree2str(root.right, sb);
                sb.append(")");
            }
        } else {
            sb.append("(");
            recursiveTree2str(root.left, sb);
            sb.append(")");
            if (root.right != null) {
                sb.append("(");
                recursiveTree2str(root.right, sb);
                sb.append(")");
            }
        }
    }

    @Test
    @DisplayName("q606ConstructStringFromBinaryTree")
    void test() {
        TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        System.out.println(tree2str(root1));

        TreeNode root2 = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        System.out.println(tree2str(root2));
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


