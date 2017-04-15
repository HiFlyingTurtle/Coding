package com.huawei.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/9.
 */
public class CountWordLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text =sc.nextLine().trim();
        int n=text.lastIndexOf(" ");
        String result=text.substring(n+1);
        System.out.print(result.length());


    }
}
