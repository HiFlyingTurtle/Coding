package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 微众在线编程01
 * @author wwh
 * @create 2017-09-28 16:30
 **/
public class WeiZhong01 {

    public static boolean isHuiWen(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

     public static String  binaryToDecimal(int n){
         String str = "";
         while(n!=0){
             str = n%2+str;
             n = n/2;
         }
         System.out.println(str);
         return str;
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int count=0;
            String str="";
            for(int i=1;i<=num;i++ ){
                str=binaryToDecimal(i);
                if(isHuiWen(str))
                    count++;
            }
            System.out.println(count);
        }
    }
}
