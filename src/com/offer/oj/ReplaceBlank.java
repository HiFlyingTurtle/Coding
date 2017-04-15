package com.offer.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/21.
 * 替换空格
 */
public class ReplaceBlank {
    public static String replaceSpace(StringBuffer str) {
     String input=str.toString();
     input=input.replace(" ","%20");
     return input;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        StringBuffer sb=new StringBuffer(text);
        System.out.println(replaceSpace(sb));

    }
}
