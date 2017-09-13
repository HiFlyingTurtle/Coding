package com.offer.oj;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的深度
 * @author wwh
 * @create 2017-09-07 23:53
 **/
public class TreeDepth {
    public static void main(String[] args) {

    }

    public int TreeDepthNoRecurrence(TreeNode root){
        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);

        int depth=0,count=0,nextCount=1;
        while(queue.size()!=0){
            TreeNode top=queue.poll();
            count++;
            if(top.left!=null){
                queue.add(top.left);
            }
            if(top.right!=null){
                queue.add(top.right);
            }
            //同一层的左右子树全部进队，出队完成之后，depth才会++
            if(count==nextCount){
                nextCount=queue.size();
                count=0;
                depth++;
            }
        }
        return depth;
    }
    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        int rLeft=TreeDepth(root.left);
        int rRight=TreeDepth(root.right);
        return rLeft>rRight?(rLeft+1):(rRight+1);

    }
}
