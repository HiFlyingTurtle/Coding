package com.scut.chunzhao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* 小米面试题
* @author wwh
* @create 2017-04-13 15:24
**/
public class KuoHao {
   public static  void generateRes(List<String> list,int left,int right,char[] buffer,int count){
       //left right 分别表示左括号和右括号的个数
       if(left==0||right==0){
           list.add(buffer.toString());
       }else {
           if(left>0){
               buffer[count]='(';
               generateRes(list,left-1,right,buffer,count+1);
           }
           if(right>left){
               buffer[count]=')';
               generateRes(list,left,right-1,buffer,count+1);
           }
       }

   }

   public  static List<String> generate(int n){
       char[] buffer=new char[n*2];
       List<String> res=new ArrayList<>();
       generateRes(res,n,n,buffer,0);
       return res;
   }

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       List<String> list=generate(n);
       for(String str:list){
           System.out.println(str);
       }
       sc.close();
   }
}
