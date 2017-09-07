package com.scut.chunzhao;

import java.util.Scanner;

/**
 * 牛客网第二次在线笔试平衡数
 *
 * @author wwh
 * @create 2017-03-23 19:34
 **/
public class BalanceNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int number=sc.nextInt();
            boolean flag=false;
            String strNumber=String.valueOf(number);
            for (int i=0;i<strNumber.length()-1;i++){
                 int left=1,right=1;
                 for(int j=0;j<=i;j++){
                     left=left*(strNumber.charAt(j)-'0');
                 }
                for (int k=i+1;k<strNumber.length();k++){
                    right=right*(strNumber.charAt(k)-'0');
                }

                if(left==right) {flag=true;break;}
            }
            if(flag==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
