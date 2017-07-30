package com.offer.oj;
import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表
 *
 * @author wwh
 * @create 2017-07-30 23:16
 **/
public class ConverseTreeToList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode p=pRootOfTree;
        TreeNode pre=null;
        boolean flag=true;
        while(!stack.isEmpty()||p!=null){
            while(p!=null){
                stack.push(p);
                p=p.left;
            }
            p=stack.pop();
            if(flag){
                pRootOfTree=p;
                pre=pRootOfTree;
                flag=false;
            }else {
                pre.right=p;
                p.left=pre;
                pre=p;
            }
            p=p.right;
        }
        return pRootOfTree;
    }
}
