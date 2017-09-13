package com.com.wwh.qiuzhao;

import java.util.Scanner;
/**
 * 京东秋招笔试在线编程
 * @author wwh
 * @create 2017-09-08 18:55
 **/
public class JinDong01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int count=0;
            for(int a=1;a<=n;a++)
                for(int b=1;b<=n;b++){
                    int s=(int)Math.pow(a,b);


//                    for(int c=1;c<=n;c++){
//                        for(int d=1;d<=n;d++){
//                            if(Math.pow(a,b)==Math.pow(c, d))
//                                count=(count+1)%1000000007;
//                        }
//                    }
                }
            System.out.println(count);
        }
    }
}
