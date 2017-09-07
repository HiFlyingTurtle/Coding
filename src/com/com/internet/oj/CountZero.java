package com.com.internet.oj;
/**
 * 计算1024阶乘后面有几个0
 * 末尾0的个数取决于乘法中因子2和5的个数。显然乘法中因子2的个数大于5的个数，所以我们只需统计因子5的个数。
 * @author wwh
 * @create 2017-08-31 11:21
 **/
public class CountZero {
    public  static int ZeroCount(int num){
        int res=0;
        while (num>5){
            num=(num-(num%5))/5;
            res+=num;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(ZeroCount(1024));
        String str = "hello world";
        int s=str.length();
    }
}
