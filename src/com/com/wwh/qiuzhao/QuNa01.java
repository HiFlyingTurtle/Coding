package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 去哪在线笔试第一题
 * @author wwh
 * @create 2017-10-11 8:57
 **/
public class QuNa01 {

    public static int getCommonSequence(String input, String resverse) {
        int len1 = input.length();
        int len2 = resverse.length();
        int[][] dp = new int[len1+1][len2+1];
        int size = 0;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (input.charAt(i-1) == resverse.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > size) {
                        size = dp[i][j];
                    }
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return size;
    }

    public static String getReverseString(String input ){
        StringBuilder result=new StringBuilder();
        String []strArray=input.split("\\s+");
        for(int i=strArray.length-1;i>0;i--){
            result.append(strArray[i]+" ");
        }
        result.append(strArray[0]);
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String input=sc.nextLine();
            System.out.println(getCommonSequence(input,getReverseString(input)));
        }

    }
}
