package com.offer.oj;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
/**
 * 从上到下打印二叉树的每个节点
 * @author wwh
 * @create 2017-07-30 23:09
 **/
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
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
}
