package com.huawei.oj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by WWH on 2017/3/11.
 */
public class CharSplit {

     public static void PrintStr(String str){
         while(str.length()>=8){
             System.out.println(str.substring(0,8));
             str=str.substring(8);
         }
         if(str.length()<8&&str.length()>0){
             StringBuffer sb=new StringBuffer(8);
             sb.append(str);
             for(int i=0;i<8-str.length();i++){
                sb.append("0");
             }
             System.out.println(sb.toString());
         }

     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>(2);
        while(sc.hasNext()){
            for(int i=0;i<2;i++){
                String text=sc.next();
                al.add(text);
            }

            for (int i=0;i<2;i++){
                PrintStr(al.get(i));
            }
        }

    }
}
