package com.company;
import java.util.*;

class TreeNode
{
    int val;
    TreeNode left,right;
    TreeNode(int x)
    {
        this.val = x;
    }
}
public class Main
{
    //Stack Queue
    //  bfs basic
    //BinaryTree Level Order
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println(solve(root));
    }
    public static List<List<Integer>> solve(TreeNode root)
    {
        //1 ds
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        //2 for, while add
        while(!queue.isEmpty())
        {
            int size = queue.size(); //1
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll(); //queue에서 뺌 pop
                list.add(node.val); //1
                if(node.left !=null)
                {
                    queue.offer(node.left);
                }
                if(node.right !=null)
                {
                    queue.offer(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}



