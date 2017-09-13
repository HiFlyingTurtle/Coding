package com.com.internet.oj;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 京东在线编程集合
 * @author wwh
 * @create 2017-09-08 11:45
 **/
public class JinDong_JiHe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> ts=new TreeSet<>();
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
//            int [] a=new int[n];
//            int [] b=new int[m];

            for(int i=0;i<n;i++){
               int a=sc.nextInt();
                ts.add(a);
            }

            for (int j=0;j<m;j++){
                int b=sc.nextInt();
                ts.add(b);
            }

            int count=0;
            for(Integer inte:ts){
                count++;
                if(count==ts.size()) break;
                System.out.print(inte+" ");

            }
            System.out.print(ts.last());

        }
    }
}
