package com.offer.oj;
import java.util.ArrayList;
/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径
 *
 * @author wwh
 * @create 2017-07-30 23:13
 **/
public class FindPathInTree {
    private ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    private ArrayList<Integer> path = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null) return res;
        path.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        path.remove(path.size()-1);

        return res;
    }
}
