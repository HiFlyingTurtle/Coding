package com.huawei.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/4/8.
 * 华为在线编程简单密码
 */
public class SimplePassWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String  clearText=sc.nextLine();
            StringBuffer sb=new StringBuffer(clearText.length());
            for (int i=0;i<clearText.length();i++){
                if(clearText.charAt(i)>='A'&&clearText.charAt(i)<='Z'){
                    //大写
                    char ch;
                    if(clearText.charAt(i)=='Z') {
                         ch='a';
                    }else {
                        ch=(char)(Integer.valueOf(clearText.charAt(i))+32+1);
                    }
                    sb.append(ch);
                }else if(clearText.charAt(i)>='a'&&clearText.charAt(i)<='z'){
                    //小写
                    if(clearText.charAt(i)>='a'&&clearText.charAt(i)<='c') sb.append("2");
                    if(clearText.charAt(i)>='d'&&clearText.charAt(i)<='f') sb.append("3");
                    if(clearText.charAt(i)>='g'&&clearText.charAt(i)<='i') sb.append("4");
                    if(clearText.charAt(i)>='j'&&clearText.charAt(i)<='l') sb.append("5");
                    if(clearText.charAt(i)>='m'&&clearText.charAt(i)<='o') sb.append("6");
                    if(clearText.charAt(i)>='p'&&clearText.charAt(i)<='s') sb.append("7");
                    if(clearText.charAt(i)>='t'&&clearText.charAt(i)<='v') sb.append("8");
                    if(clearText.charAt(i)>='w'&&clearText.charAt(i)<='z') sb.append("9");
                }else {
                    sb.append(clearText.charAt(i));

                }
            }
            System.out.println(sb.toString());

        }
        sc.close();
    }
}
