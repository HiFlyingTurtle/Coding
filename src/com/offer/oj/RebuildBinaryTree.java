package com.offer.oj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指offer重建二叉树
 *
 * @author wwh
 * @create 2017-03-22 20:09
 **/
public class RebuildBinaryTree {
    /**
     * 重建二叉树 先找到根节点 找到左子树 找到右子树
     * 找到左子树的先序 中序 找到右子树的先序 中序 递归下去
     * @param pre
     * @param in
     * @return
     */
    public  static  TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int head=0;
        if(pre.length!=in.length||pre.length==0||in.length==0) return null;
        TreeNode root=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(in[i]==root.val){
                head=i;
                break;
            }
        }

        int []preLeft=new int[head];
        int []intLeft=new int[head];

        int []preRight=new int[pre.length-head-1];
        int []inRight=new int[in.length-head-1];

        for(int j=0;j<in.length;j++){
            if(j<head){
                preLeft[j]=pre[j+1];
                intLeft[j]=in[j];
            }else if(j>head){
                inRight[j-head-1]=in[j];
                preRight[j-head-1]=pre[j];
            }
        }

        root.left=reConstructBinaryTree(preLeft,intLeft);
        root.right=reConstructBinaryTree(preRight,inRight);

        return root;

    }
    //先序遍历递归打印二叉树
    public static void preOrder(TreeNode root){
        if(root!=null){
            System.out.print(root.val + "-->");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //实现按层次打印二叉树
    public static ArrayList<Integer> LevelPrintTree(TreeNode root){
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tn= queue.remove();
            result.add(tn.val);
            if(tn.left!=null){
                queue.add(tn.left);
            }
            if(tn.right!=null){
                queue.add(tn.right);
            }
        }

          return result;
    }

    public static void main(String[] args) {
        int [] pre={1,2,4,7,3,5,6,8};
        int [] in={4,7,2,1,5,3,8,6};
        TreeNode root=reConstructBinaryTree(pre,in);
        preOrder(root);

    }
}
class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
}