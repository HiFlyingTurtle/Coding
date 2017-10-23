package com.com.wwh.qiuzhao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * 大疆在线笔试
 *  输入一个二叉树的矩阵存储，
 * @author wwh
 * @create 2017-09-17 9:15
 **/
public class DaJiang03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int[] nums=new int[num-1];
        int[] sons=new int[num-1];
        int[] fathers=new int[num-1];
        int[] type=new int[num-1];
        for(int i=0;i<num-1;i++){
            sons[i]=scan.nextInt();
            fathers[i]=scan.nextInt();
            type[i]=scan.nextInt();
        }
        int target=scan.nextInt();
        DaJiang03 s=new DaJiang03();
        s.solve(sons,fathers,type,target);


    }
    public void solve(int[] sons,int[] fathers,int[] type,int k){
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        HashSet<Integer> f=new HashSet<Integer>();
        HashSet<Integer> s=new HashSet<Integer>();
        for(int i=0;i<sons.length;i++) s.add(sons[i]);
        for(int i=0;i<fathers.length;i++) f.add(fathers[i]);
        int root=-1;
        for(Integer a:f){
            if(!s.contains(a)){
                root=a;break;
            }
        }
        HashMap<Integer,List<Integer>> tree=new HashMap<>();
        for(int i=0;i<fathers.length;i++){
            if(!tree.containsKey(fathers[i])) tree.put(fathers[i],new ArrayList<Integer>());
            tree.get(fathers[i]).add(sons[i]);
        }
        dfs(tree,k);
        System.out.println(re);
    }
    int re=0;
    private void dfs(HashMap<Integer, List<Integer>> tree, int k) {
        re++;
        if(!tree.containsKey(k)){
            return;
        }
        List<Integer> a=tree.get(k);
        for(int i=0;i<a.size();i++){
            dfs(tree,a.get(i));
        }
    }
}


