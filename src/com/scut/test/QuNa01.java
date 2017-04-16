package com.scut.test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
* 去哪网在线编程
* @author wwh
* @create 2017-04-01 18:34
**/
public class QuNa01 {

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

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int []pre=new int[n];
       int []in=new int[n];
       for(int i=0;i<n;i++){
           pre[i]=sc.nextInt();
       }

       for (int i=0;i<n;i++){
           in[i]=sc.nextInt();
       }

       TreeNode root=reConstructBinaryTree(pre,in);
       ArrayList<Integer> list=LevelPrintTree(root);
       for (int i=0;i<list.size()-1;i++){
           System.out.print(list.get(i) + " ");
       }
       System.out.println(list.get(list.size()-1));


   }



}


