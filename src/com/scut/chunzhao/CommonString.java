package com.scut.chunzhao;

import java.util.Scanner;
/**
 * 牛客网在线编程第二次最长公共连续子串
 * @author wwh
 * @create 2017-03-29 22:15
 **/
public class CommonString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line1=sc.nextLine();
        String line2=sc.nextLine();
 //       System.out.println(line1+" "+line1);
        int [][]dp=new int[line1.length()+1][line2.length()+2];
        char[] ch1=line1.toCharArray();
        char[] ch2=line2.toCharArray();

        for (int i=0;i<line1.length();i++){
            if(ch1[i]==ch2[0]){
                dp[i][0]=1;
            }
        }

        for (int i=0;i<line2.length();i++){
            if(ch2[i]==ch1[0]){
                dp[0][i]=1;
            }
        }
        int max=dp[0][0];
        for (int i=1;i<line1.length();i++){
            for (int j=1;j<line2.length();j++){
                if(ch1[i]==ch2[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
