package com.scut.chunzhao;
import java.util.Scanner;

/**
 * 微众银行在线笔试编程题01
 * @author wwh
 * @create 2017-04-25 18:56
 **/
public class WeiZhong01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int codeSum=sc.nextInt();
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        int count=0;
        for(int i=0;i<=first;i++){
            for (int j=0;j<=second;j++){
                int left=codeSum-5*i-8*j;
                if(left%10==0&&(left/10>=0&&left/10<=third)){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
