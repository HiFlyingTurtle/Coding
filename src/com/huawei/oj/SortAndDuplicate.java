package com.huawei.oj;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by WWH on 2017/3/9.
 */
public class SortAndDuplicate {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
        Integer n=sc.nextInt();
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<n;i++){
           Integer temp=sc.nextInt();
            ts.add(temp);
        }

        for(Integer el:ts){
            System.out.println(el);

        }

        }

    }
}
