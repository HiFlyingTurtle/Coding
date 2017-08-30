package com.com.wwh.qiuzhao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 滴滴秋季招聘在线编程第二题
 * @author wwh
 * @create 2017-08-26 15:51
 **/
public class DiDi02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String line=sc.nextLine();
            int k=sc.nextInt();
            String [] array=line.split("\\s+");
            Integer [] numArray=new Integer[array.length];

            for(int i=0;i<array.length;i++){
                numArray[i]=Integer.valueOf(array[i]);
            }

            Arrays.sort(numArray, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -(o1-o2);
                }
            });

            System.out.println(numArray[k-1]);

        }
    }
}
