package com.scut.test;
import java.util.*;

/**
 * Created by WWH on 2017/4/6.
 * 京东2016实习生招聘在线编程题
 * 输出比较麻烦 需要考虑到输出只有一个元素的情况 以及元素的个数小于s的情况 输出的时候需要考虑全面才可以
 */
public class JiaoYiQingDan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int s=sc.nextInt();
            HashMap<Integer,Integer> sMap=new HashMap<>();
            HashMap<Integer,Integer> bMap=new HashMap<>();
            for (int i=0;i<n;i++){
                String symbol=sc.next();
                int p=sc.nextInt();
                int q=sc.nextInt();
                if(symbol.equals("B")){
                 if(bMap.containsKey(p)){
                     bMap.put(p,bMap.get(p)+q);
                 }else{
                     bMap.put(p,q);
                 }
                }
                if(symbol.equals("S")){
                    if(sMap.containsKey(p)){
                        sMap.put(p,sMap.get(p)+q);
                    }else {
                        sMap.put(p,q);
                    }

                }
            }

            //对Map进行排序 按照价格降序
            List<Map.Entry<Integer, Integer>> sList = new ArrayList<Map.Entry<Integer,Integer>>(sMap.entrySet());
            List<Map.Entry<Integer, Integer>> bList = new ArrayList<Map.Entry<Integer,Integer>>(bMap.entrySet());
            Collections.sort(sList, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return -(o1.getKey()-o2.getKey());
                }
            });

            Collections.sort(bList, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return -(o1.getKey()-o2.getKey());
                }
            });
            if(sList.size()>0) {
                    if (sList.size() < s) {
                        for (int i = 0; i < sList.size(); i++) {
                            System.out.println("S " + sList.get(i).getKey() + " " + sList.get(i).getValue());
                        }
                    } else {
                        for (int i = 0; i < s; i++) {
                            System.out.println("S " + sList.get(i).getKey() + " " + sList.get(i).getValue());
                        }
                    }
            }
            if(bList.size()>0){
                if(bList.size()<s){
                    for (int i=0;i<bList.size();i++){
                        System.out.println("B "+bList.get(i).getKey()+" "+bList.get(i).getValue());
                    }

                }else {
                    for (int i=0;i<s;i++){
                        System.out.println("B "+bList.get(i).getKey()+" "+bList.get(i).getValue());
                    }

                }

            }


        }
         sc.close();
    }
}
