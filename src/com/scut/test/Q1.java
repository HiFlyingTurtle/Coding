package com.scut.test;

import java.util.Scanner;

/**
 * 网易笔试在线编程第一道题
 *
 * @author wwh
 * @create 2017-03-25 13:59
 **/
public class Q1 {


    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            while (sc.hasNext()) {
            int result = 0;
            int taxiNum = sc.nextInt();
            int[] x = new int[taxiNum];
            int[] y = new int[taxiNum];
            for (int j = 0; j < taxiNum; j++) {
                x[j] = sc.nextInt();
            }

            for (int k = 0; k < taxiNum; k++) {
                y[k] = sc.nextInt();
            }

            int officeX = sc.nextInt();
            int officeY = sc.nextInt();

            int walkTime = sc.nextInt();
            int taxiTime = sc.nextInt();

              int min =(Math.abs( officeX) + Math.abs(officeY)) * walkTime;
                for(int l=0;l<taxiNum;l++){
                    int temp=(Math.abs(x[l]) + Math.abs(y[l])) * walkTime;
                    temp = temp + (Math.abs(x[l] - officeX) + Math.abs(y[l] - officeY)) * taxiTime;
                    if(temp<min){
                        min=temp;
                    }
                }
                result=min;
                System.out.println(result);

            }
        }
}

