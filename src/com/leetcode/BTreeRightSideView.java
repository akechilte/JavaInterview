package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbiswas on 7/30/18.
 */
public class BTreeRightSideView {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result, 0);
        return result;

    }

    private void helper(TreeNode root, List<Integer> result, int currDepth){

        if(root == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(root.val);
        }

        helper(root.right, result, currDepth + 1);
        helper(root.left, result, currDepth + 1);
    }

    public static void main(String[] args) {

    }
}
