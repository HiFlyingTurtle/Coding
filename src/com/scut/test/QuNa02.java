package com.scut.test;

import java.util.Scanner;

/**
 * 去哪在线编程02
 *
 * @author wwh
 * @create 2017-04-01 18:35
 **/
public class QuNa02 {
    public static  long tranverseToDecimal(String line){
        long result=0;
        int temp=0;
        int len=line.length();
        for (int i=len-1;i>=0;i--){
            temp=line.charAt(i)-'a';
            result+=temp*Math.pow(26,len-1-i);

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
         String line=sc.next();
            System.out.println(tranverseToDecimal(line));
        }
    }
}
