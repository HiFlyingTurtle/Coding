package com.offer.oj;
import java.util.Arrays;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果
 * @author wwh
 * @create 2017-07-30 23:12
 **/
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0) return false;
        if(sequence.length==1) return true;
        int root=sequence[sequence.length-1];
        int i=0;
        int j;
        while(sequence[i]<root){
            i++;
        }
        for(j=i;j<sequence.length-1;j++){
            if(sequence[j]<root) return false;
        }
        boolean left=true;
        if(i>0)
            left=VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0,i));
        boolean right=true;
        if(i<sequence.length-1)
            right=VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length-1));

        return left&&right;

    }
}
