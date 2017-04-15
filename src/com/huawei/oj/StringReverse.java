package com.huawei.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/9.
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
