package com.huawei.oj;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by WWH on 2017/3/15.
 */
public class MergeTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer ,Integer> tm=new TreeMap<>();
        while(sc.hasNext()){
            int line=sc.nextInt();
            for (int i=0;i<line;i++){
                      int key=sc.nextInt();
                      int value=sc.nextInt();
                if(tm.containsKey(key)){
                    tm.put(key,tm.get(key)+value);
                }else{
                    tm.put(key,value);
                }
            }
            for(Integer index:tm.keySet()){
                System.out.println(index+" "+tm.get(index));
            }
        }

        sc.close();
    }
}
