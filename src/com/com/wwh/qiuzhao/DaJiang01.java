package com.com.wwh.qiuzhao;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 大疆笔试题
 * @author wwh
 * @create 2017-09-13 21:08
 **/
public class DaJiang01 {

    public static ArrayList<Integer> list=new ArrayList<Integer>();

    public static int getSum(ArrayList<Integer> list){
        int sum=0;
        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i);
        }
        return sum;
    }

  public    static int getSubsets(ArrayList<Integer> set, ArrayList<Integer> query){
        int res=0;
        int max = 1 << set.size();
        for(int i=0; i<max; i++){
            int index = 0;
            int k = i;
            ArrayList<Integer> list = new ArrayList<Integer>();
            while(k > 0){
                if((k&1) > 0){
                    list.add(set.get(index));
                }
                k>>=1;
                index++;
            }
            int sum=getSum(list);
        }
        return res;
    }

    public static  boolean getSub(int []data,int query,int step){
        while (step<data.length){
            list.add(data[step]);
            if(getSum(list)==query){
                return true;
            }
            step++;
            getSub(data,query,step);
            list.remove(list.size()-1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<Integer> data=new ArrayList<Integer>();
            ArrayList<Integer> query=new ArrayList<Integer>();
            for (int i=0;i<n;i++){
                data.add(sc.nextInt());
            }

            for(int i=0;i<m;i++){
                query.add(sc.nextInt());
            }

            System.out.println(getSubsets(data,query));
        }

    }
}
