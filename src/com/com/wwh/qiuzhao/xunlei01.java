package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 迅雷在线编程
 * @author wwh
 * @create 2017-09-18 19:30
 **/
public class xunlei01 {
    private static String multiString(String str, int num) {
        char[] c = str.toCharArray();
        char[] result = new char[c.length + 1];
        int temp = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            int j = (int) c[i] - 48;
            int all = j * num;
            result[i + 1] = ((char) ((all % 10 + temp) % 10 + 48));
            temp = (all + temp) / 10;
        }
        if (temp != 0) {
            result[0] = (char) (temp + 48);
        }
        return String.valueOf(result).replaceAll("\u0000", "");
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int i = 0;
            String result = "1";
            while (i < n) {
                result = multiString(result, 2);
                i++;
            }
            System.out.println(result);
        }
    }

}
