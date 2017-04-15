package com.huawei.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/9.
 */
public class CountCharNum {

    public static int charNum(String str,char c){
        int num=0;
        for(char ch:str.toCharArray()){
           if(ch==c) num++;
        }
        return num;

    }

    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next().trim();
        char c=sc.next().charAt(0);
        int num=charNum(text.toLowerCase(),Character.toLowerCase(c));
        System.out.println(num);

    }
}
