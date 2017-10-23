package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 微众在线编程03
 * @author wwh
 * @create 2017-09-28 17:03
 **/
public class WeiZhong03 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int res=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=Math.max(Math.max(a,b),c);
            int [] add=new int[max+3];
            int [] sub=new int[max+3];
            if(a==b){
                add[a+1]=1;
                max=max+1;
            }else{
                add[a]=1;
                add[b]=1;
            }
            sub[c]=1;
            int pos=0;
            for(int i=0;i<=max;i++){
                add[i]=add[i]-sub[i];
                if(add[i]==-1)
                    pos=i;
            }


            for(int t=pos;t<=max;t++){
                if(add[t]==-1)
                    add[t]=add[t]+2;
                else
                    add[t]=add[t]+1;

                if(add[t]==2){
                    add[t]=0;
                    break;
                }
            }

            for(int i=0;i<=max;i++){
                if(add[i]==1)
                    res++;
            }

            System.out.println(res);

        }
    }
}
