package com.huawei.oj;

import java.util.Scanner;
import java.lang.Math;
/**
 * Created by WWH on 2017/3/11.
 */
public class HexToDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String text=sc.nextLine();
            text=text.substring(2);
            int count=0;
            int temp=0;
            int len=text.length();
            for(int i=len-1;i>=0;i--){
                if(text.charAt(i)>='A'&&text.charAt(i)<='F'){
                    temp=text.charAt(i)-'A'+10;
                    count+=temp*Math.pow(16,len-1-i);
                }else if(text.charAt(i)>='0'&&text.charAt(i)<='9'){
                    temp=text.charAt(i)-'0';
                    count+=temp*Math.pow(16,len-1-i);
                }
            }
            System.out.println(count);


        }

    }
}
