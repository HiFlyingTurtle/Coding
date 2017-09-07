package com.scut.chunzhao;

import java.util.Scanner;

/**
 * 网易笔试在线编程题第二题
 * 字符串
 * @author wwh
 * @create 2017-03-25 16:19
 **/
public class Q2 {
    public static int CountB(char [] array){
        int res=0;
        int count=0;
        for (int i=0;i<array.length;i++){
            if(array[i]=='B') count++;
            else res+=count;
        }
        return res;

    }

    public static int CountG(char [] array){
        int res=0;
        int count=0;
        for (int i=0;i<array.length;i++){
            if(array[i]=='G') count++;
            else res+=count;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        char [] arr=line.toCharArray();
        int sum1=CountB(arr);
        int sum2=CountG(arr);
        System.out.println(Math.min(sum1,sum2));
    }

}
