import java.util.*;

public class Solution {
    static int maxStep = 0;
    public static int longestZigZag(Tree root) {
        dfs(root, true, 0);
        dfs(root, false, 0);
        if(maxStep == 0)
            return 0;
        return maxStep-1;
    }
    private static void dfs(Tree root, boolean isLeft, int step) {
        if (root == null) return;
        maxStep = Math.max(maxStep, step); // update max step sofar
        if (isLeft) {
            dfs(root.l, false, step + 1); // keep going from root to left
            dfs(root.r, true, step); // restart going from root to right
        } else {
            dfs(root.r, true, step + 1); // keep going from root to right
            dfs(root.l, false, step); // restart going from root to left
        }
    }
    public static void main(String[] args) {
        Tree T = new Tree(5, new Tree(3, new Tree(20, new Tree(6, null, null), null), null), new Tree(10, new Tree(1, null, null), new Tree(15, new Tree(30, null, new Tree(9, null, null)), new Tree(8, null, null))));
        System.out.println(longestZigZag(T));
    }
}
class Tree{
    int x;
    Tree l;
    Tree r;
    public Tree(int val, Tree left, Tree right){
        this.x = val;
        this.l = left;
        this.r = right;
    }
}




