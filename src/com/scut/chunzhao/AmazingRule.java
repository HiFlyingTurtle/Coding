package com.scut.chunzhao;

import java.util.Scanner;

/**
 * 人人网笔试题神奇的规律
 * 同余定理 加法乘法同余性质
 * @author wwh
 * @create 2017-03-19 23:23
 **/
public class AmazingRule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            long number=sc.nextInt();
            long  x=1,y=0;
            while (x<number){
                if(number%x==1) break;
                else x++;
            }

            long  b1 = number + 1;
            long  b2 = number * number - 1;
            for (int i = 2; i <= b1; i++) {
                if (b1 % i == 0 && b2 % i == 0) {
                    y = i;
                    break;
                }
            }
            System.out.println(x+" "+y);

        }

    }

}
