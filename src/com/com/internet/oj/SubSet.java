package com.com.internet.oj;

import com.algorithm.InsertSort;

import java.util.ArrayList;

/**
 * 求一个集合的子集合问题
 *输出一个集合的子集合
 * @author wwh
 * @create 2017-10-12 14:13
 **/
public class SubSet {
   public static ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set){
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
        int max = 1 << set.size(); //how many sub sets
        for(int i=0; i<max; i++){
            int index = 0;
            int k = i;
            ArrayList<Integer> s = new ArrayList<Integer>();
            while(k > 0){
                if((k&1) > 0){
                    s.add(set.get(index));
                }
                k>>=1;
                index++;
            }
            allsubsets.add(s);
        }
        return allsubsets;
    }

    public static ArrayList<ArrayList<Integer>> getSubSets(ArrayList<Integer> set,int index){
        ArrayList<ArrayList<Integer>> allSubSets;
        if(set.size()==index){
            allSubSets=new ArrayList<ArrayList<Integer>>();
            allSubSets.add(new ArrayList<Integer>());
        }else {
            allSubSets=getSubSets(set,index+1);
            int item=set.get(index);
            ArrayList<ArrayList<Integer>> moresubsets=new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> s:allSubSets){
                ArrayList<Integer> newSubset=new ArrayList<>();
                newSubset.addAll(s);
                newSubset.add(item);
                moresubsets.add(newSubset);
            }
            allSubSets.addAll(moresubsets);
        }
        return allSubSets;
    }
    public static void main(String[] args) {

    }
}
