package com.com.wwh.qiuzhao;
import java.util.Scanner;

/**
 * 搜狐秋招笔试在线编程01题
 * @author wwh
 * @create 2017-08-28 19:01
 **/
public class souhu01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();

            int a[]=new int[m+1];
            for(int i=1;i<=m;i++){
                a[i]=sc.nextInt();
            }

            int [] res=new int[n+2];
            int count=1;

            for(int t=1;t<=a[1];t++){
                res[count++]=a[1];
            }

            for(int i=2;;i++){
                if(res[1]==1&&res[2]==0){
                    for(int k=1;k<=a[i%m];k++){
                        res[count++]=a[i%m];
                    }
                }else{
                    for(int t=1;t<=res[i];t++){
                        res[count++]=a[i%m];
                    }
                }

                if(count>=n+1) break;
            }

           for(int i=1;i<=n;i++){
               System.out.println(res[i]);
           }

        }
    }
}
