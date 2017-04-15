package com.huawei.oj;

import java.util.*;

/**
 * Created by WWH on 2017/3/15.
 * 注意输出的时候是否有空格以及是否需要换行等要求
 * 或者提交的时候会一直的报错
 */
public class TopK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int length=sc.nextInt();
            int outNum=sc.nextInt();
            int[] list=new int[length];
            for(int i=0;i<length;i++){
                list[i] =sc.nextInt();
            }
            Arrays.sort(list);
            for (int j=0;j<outNum;j++){
                if (j!=outNum-1){
                    System.out.print(list[j]+" ");
                }else {
                    System.out.print(list[j]);
                }

            }
            //输出完之后需要换行
            System.out.println();
        }
        sc.close();
    }
}


