package com.scut.test;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/20.
 * 360在线笔试题 小明同学跑步
 */
public class Running {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l=sc.nextInt();
        double r=sc.nextInt();
        //计算小明跑步走过的角度
        double temp=l%(2*Math.PI*r);
        double angle=temp/r;

        //顺时针
        double x1=r*Math.cos(angle);
        double y1=r*Math.sin(-angle);

        //逆时针
        double x2=r*Math.cos(angle);
        double y2=r*Math.sin(angle);


        System.out.printf("%.3f %.3f",x1,y1);
        System.out.println();
        System.out.printf("%.3f %.3f",x2,y2);





    }
}
