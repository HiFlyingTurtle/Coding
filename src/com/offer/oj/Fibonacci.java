package com.offer.oj;
/**
 * 斐波那契数列
 * @author wwh
 * @create 2017/5/14
 */
public class Fibonacci {
    public static int Fibonacci(int n) {
        int result=0;
        int a1=1;
        int a2=1;
        if(n==1) return 1;
        if(n==2) return 1;
        for(int i=3;i<=n;i++){
            result=a1+a2;
            a1=a2;
            a2=result;
        }
     return result;
    }

    public int RectCover(int target) {
        if (target < 1) {
            return 0;
        } else if (target == 1 || target == 2) {
            return target;
        } else {
            return RectCover(target-1) + RectCover(target-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(39));
    }
}
