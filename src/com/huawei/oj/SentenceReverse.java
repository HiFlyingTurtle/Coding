package com.huawei.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/10.
 */
public class SentenceReverse {

    public String reverse(String sentence){
        StringBuffer sb=new StringBuffer();
        String []sArray=sentence.split(" ");
        for(int i=sArray.length-1;i>0;i--){
            sb.append(sArray[i]);
            sb.append(" ");
        }
        sb.append(sArray[0]);
       return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        SentenceReverse sr=new SentenceReverse();
        System.out.print( sr.reverse(text));
    }
}
