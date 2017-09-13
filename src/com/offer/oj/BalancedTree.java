package com.offer.oj;
/**
 * 判断一棵二叉树是否是平衡的
 * 左右子树的高度不会相差超过1
 * @author wwh
 * @create 2017-09-08 10:29
 **/
public class BalancedTree {

    /**
     * 判断二叉树的高度
     * @param root
     * @return
     */
    public int getDepth(TreeNode root){
        if(root==null) return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        return right>left?right+1:left+1;

    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return  true;

        if(Math.abs(getDepth(root.left)-getDepth(root.right))>1)
           return false;
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }

    public static void main(String[] args) {


    }
}
