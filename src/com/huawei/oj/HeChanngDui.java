package com.huawei.oj;
import java.util.Scanner;
/**
 * 华为OJ在线编程合唱队
 * 还未完成编程
 * @author wwh
 * @create 2017-04-08 16:24
 **/
public class HeChanngDui {
    public static int[] maxLengthOfLIS(int a[]){
        int [] dp=new int[a.length];
        for (int i=0;i<a.length;i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] heightForward = new int[n];
            int[] heightBackward = new int[n];
            int[] Inc = new int[n];
            int[] Dec = new int[n];

            for (int i = 0; i < n; i++) {
                int height = sc.nextInt();
                heightForward[i] = height;
                heightBackward[n - i - 1] = height;
            }
            Inc = maxLengthOfLIS(heightForward);
            //逆序输入之后和顺序对应的位置还是逆序
            Dec = maxLengthOfLIS(heightBackward);
            int sum = 0;
            int max = -1;
            for (int i = 0; i < n; i++) {
                sum = Inc[i] + Dec[n - i - 1];
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(n - max + 1);
        }

    }
}
