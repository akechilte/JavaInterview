package com.leetcode;

/**
 * Created by mbiswas on 7/30/18.
 */
public class SerializeDeserializeBTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();

    }

    private void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null");
            sb.append(',');
        } else {
            sb.append(root.val);
            sb.append(',');
            helper(root.left, sb);
            helper(root.right, sb);
        }

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] splittedData = data.split(",");
        int[] ref = new int[1];
        ref[0] = 0;
        return helper(splittedData, ref);

    }


    private TreeNode helper(String[] data, int[] ref) {
        if (data[ref[0]].equals("null")) {
            ref[0]++;
            return null;
        }
        TreeNode current = new TreeNode(Integer.valueOf(data[ref[0]]));
        ref[0]++;
        current.left = helper(data, ref);
        current.right = helper(data, ref);
        return current;
    }
}
