package com.offer.oj;
/**
 * 判断一棵树是否是另外一棵树的子结构
 * PS:我们约定空树不是任意一个树的子结构
 * @author wwh
 * @create 2017/5/17
 */
public class SubStructure {

    public boolean IsSameOrNotParentAndChild(TreeNode  parent,TreeNode child){
        //子树为NULL,那么必然会是子树 整个地方容易错误
        if(child==null) return true;
        if(parent==null && child!=null) return false;
        if(parent.val!=child.val){
            return  false;
        }else{
            return  IsSameOrNotParentAndChild(parent.left,child.left)&& IsSameOrNotParentAndChild(parent.right,child.right);
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null||root1==null) return false;
        boolean result=false;
        if(root1.val==root2.val){
           result=IsSameOrNotParentAndChild(root1,root2);
        }
        if (!result){
            return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
        }else {
            return true;
        }

    }
    public static void main(String[] args) {

    }
}
