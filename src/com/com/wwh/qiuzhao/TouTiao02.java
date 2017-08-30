package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 今日头条校园招聘编程第二题
 * @author wwh
 * @create 2017-08-22 18:14
 **/
public class TouTiao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sec = new int[n];

        for (int i = 0; i < n; i++) {
            sec[i] = in.nextInt();
        }

        long maxNum = sec[0] * sec[0];
        for (int i = 0; i < n; i++) {
            if (sec[i] != 0) {

                int min = sec[i];

                long sum = 0;
                for (int j = 0; j < n - i - 1; j++) {

                    if (j != 0 && min > sec[i + j]) {
                        min = sec[i + j];
                    }
                    sum += sec[i + j];

                    long value = sum * min;
                    if (value > maxNum) {
                        maxNum = value;
                    }
                }
            }
        }

        System.out.println(maxNum);

    }

}