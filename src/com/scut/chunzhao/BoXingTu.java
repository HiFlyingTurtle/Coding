package com.scut.chunzhao;

import java.util.Scanner;

/**
 * 人人网笔试题波形图匹配
 *
 * @author wwh
 * @create 2017-03-19 22:40
 **/
public class BoXingTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for (int i=0;i<line;i++){
            String pic=sc.next();
            StringBuilder sb=new StringBuilder();
           if(pic.charAt(0)=='-'||pic.charAt(0)=='+'){
               for (int j=0;j<pic.length();j++){
                   if(pic.charAt(j)=='-'){
                       sb.append("__");
                   }else {
                       sb.append("/\\");
                   }
               }
           }else{
               for(int j=0;j<pic.length();j=j+2){
             //      System.out.println(pic);
                   System.out.println(pic.substring(j,j+2));
                   if(pic.substring(j,j+2).equals("__")){
                       sb.append("-");
                   }else{
                       sb.append("+");
                   }
               }

           }
            System.out.println(sb.toString());
        }

        sc.close();

    }


}
