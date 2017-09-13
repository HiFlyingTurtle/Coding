package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 网易秋招在线编程
 * @author wwh
 * @create 2017-09-09 14:45
 **/
public class NetEase04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n,four,two,one,num;
        while (sc.hasNext()){
             t=sc.nextInt();
            for(int i=0;i<t;i++){
                 n=sc.nextInt();
                 four=0;one=0;two=0;
                for(int j=0;j<n;j++){
                    num=sc.nextInt();
                    if(num%4==0) four++;
                    else if(num%2==0) two++;
                    else one++;
                }

                if(one>four+1||(one==four+1&&two!=0))
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }

        }

    }
}
