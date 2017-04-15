package com.huawei.oj;
import java.util.Scanner;
/**
 * 华为在线编程题汽水瓶
 * @author wwh
 * @create 2017-04-08 15:32
 **/
public class QiShuiPing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int num=0;
            while(n!=0&&n!=1){
                int t=n/3;
                num=num+t;
                int x=n%3;
                n=t+x;
                if(n==2){
                    n=n+1;
                }
            }
            System.out.println(num);
        }

    }
}
