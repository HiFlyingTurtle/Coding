package com.offer.oj;

import com.algorithm.Tree;

import java.util.Stack;

/**
 * 剑指offer操作指定的二叉树，将其变换为源二叉树的镜像树
 * @author wwh
 * @create 2017/5/17
 */
public class MirrorTree {

    public void Mirror(TreeNode root){
        if(root==null) return ;
        if(root.left==null&&root.right==null) return ;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        if(root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }
    }

    /**
     * 采用非递归完成镜像树
     * @param root
     */
    public  void MirrorNonRecurively(TreeNode root){
        if(root==null) return ;

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (stack.size()!=0){
            root=stack.pop();
            if(root.left!=null|| root.right!=null){
                TreeNode temp=root.left;
                root.left=root.right;
                root.right=temp;
            }

            if(root.left!=null){
                stack.push(root.left);
            }

            if(root.right!=null){
                stack.push(root.right);
            }
        }
    }
    public static void main(String[] args) {

    }
}
