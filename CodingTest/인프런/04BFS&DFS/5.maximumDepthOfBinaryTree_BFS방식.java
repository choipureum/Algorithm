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
    //bfs stack방식
    //Maximum Depth Of BinaryTree
    public static void main(String[] args)
    {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        System.out.println(bfs(tree));
    }
    public static int bfs(TreeNode root)
    {
        //error check
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count=0; //depth

        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                if(node.right !=null)
                {
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;

    }
}
















