package com.offer.oj;
import java.util.ArrayList;
import java.util.Collections;
/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * @author wwh
 * @create 2017-08-12 13:49
 **/
public class CharPermutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res=new ArrayList<>();
        if(str.length()==0||str==null) return res;
        char [] chaArray=str.toCharArray();
        PermutationHelper(chaArray, 0, res);
        Collections.sort(res);

        return res;
    }
    public   void PermutationHelper(char [] cs,int i,ArrayList<String> list){
        if(cs.length-1==i){
            String val=String.valueOf(cs);
            if(!list.contains(val))
                list.add(val);
        }else{
            for(int j=i;j<cs.length;j++){
                swap(cs, i, j);
                PermutationHelper(cs, i+1, list);
                swap(cs, i, j);
            }
        }
    }

    public  void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
}
