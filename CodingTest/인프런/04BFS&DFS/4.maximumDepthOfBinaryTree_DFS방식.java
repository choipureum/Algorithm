package com.company;
import sun.reflect.generics.tree.Tree;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x)
    {
        this.val = x;
    }
}
public class Main
{
    //dfs stack방식
    //Maximum Depth Of BinaryTree
    public static void main(String[] args)
    {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        System.out.println(dfs(tree));
    }
    public static int dfs(TreeNode root)
    {
        //error check
        if(root == null)
        {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> valueStack = new Stack<Integer>();
        stack.push(root);
        valueStack.push(1);
        int max = 0;

        while(!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            int count = valueStack.pop();
            max = Math.max(max,count);
            if(node.left != null)
            {
                stack.push(node.left);
                valueStack.push(1+count);
            }
            if(node.right !=null)
            {
                stack.push(node.right);
                valueStack.push(1+count);
            }
        }
        return max;
    }
}
















