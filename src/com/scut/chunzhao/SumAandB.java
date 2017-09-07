package com.scut.chunzhao;

import java.util.Scanner;

/**
 * 求和
 * @author wwh
 * @create 2017-03-17 10:47
 **/
public class SumAandB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);
        }

        sc.close();
    }

}
