package com.scut.chunzhao;
import java.util.Scanner;

/**
 * Created by WWH on 2017/3/20.
 * n阶台阶,每次只能跳一阶或者两阶
 * 每次都是忘记输入多个整数，输入测试数据包括多组
 * 递归运行时间太长不符合题意，所以不能采用递归来解决
 * 要使用long 来存储变量，输出的值可能int存不下  OJ的时候注意考虑这种情况
 */
public class TaiJie {
    public  static  int Solution(int n){
        int []result={0,1,2};
        if(n<=2) return result[n];

        return Solution(n-1)+Solution(n-2);
    }

    public static  long Solution1(int n){
        long []result=new long[n+2];
        result[0]=0;
        result[1]=1;
        result[2]=2;
        if(n<=2) return result[n];
        else {
          for (int i = 3; i <= n; i++) {
              result[i] = result[i - 1] + result[i - 2];
          }
            return result[n];
      }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            long num=Solution1(n);
            System.out.println(num);
        }

    }
}
