package com.huawei.oj;
import java.util.Scanner;

/**
 * Created by WWH on 2017/3/10.
 */
public class NumOfOne {

    public static int NumberOf1II(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }


    int  NumberOf1(int n) {
        return Integer.bitCount(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while (num>0){
            if(num%2==1) count++;
            num=num/2;
        }
        System.out.println(count);
        sc.close();
    }
}
