package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 招行信用卡在线笔试
 * @author wwh
 * @create 2017-09-13 18:56
 **/
public class ZhaoHangXinYongKa01 {
    public  static int gcd(int m,int n){
        if(m%n==0) return n;
        else {
            return gcd(n, m % n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int gc=gcd(a,b);
            int lcm=(a*b)/gc;
            int num=0;
            for(int i=1;;i++){
                if(lcm *i>n) break;
                num++;
            }
            System.out.println(num);
        }

    }

}
