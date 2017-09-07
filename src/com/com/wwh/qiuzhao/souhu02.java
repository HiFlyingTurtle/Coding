package com.com.wwh.qiuzhao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 搜狐笔试在线编程第二题
 * 参考：http://blog.csdn.net/zwj1452267376/article/details/50428543
 * 题目：http://blog.csdn.net/dingpiao190/article/details/77742725
 * @author wwh
 * @create 2017-09-01 15:19
 **/
public class souhu02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String end = "0 0 0 0 0 0";
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            list.add(string);
            if (string.equals(end)) {
                break;
            }
        }
        scanner.close();
        for (int i = 0; i < list.size() - 1; i++) {
            String string = list.get(i);
            long result = caculate(string);
            if (i == list.size() - 1) {
                System.out.print(result);
            } else {
                System.out.println(result);
            }
        }
    }

    public static int caculate(String string) {
        String[] arr = string.split(" ");
        int[] a = new int[arr.length+1];
        for (int i = 1; i < arr.length+1; i++) {
            a[i] = Integer.parseInt(arr[i-1]);
        }
        int[] num2 = {0,5,3,1};//6*6的大箱子，放入i个3*3小箱子之后，还能放入*2 的箱子num2[i]个小箱子
        int result = a[6]+a[5]+a[4];//6*6和5*5和4*4一定是一个占一个箱子，而3*3 是4个占一个箱子
        int n2 = a[4]*5+num2[a[3]%4];
        if(a[2]>n2){
            result += (a[2]-n2+8)/9;//如果前面剩余的空间还不够放2*2，求出多需要几个2*2的空间，+8是为了向上取整，
        }
        int n1 = 36*(result-a[6])-a[5]*5*5-a[4]*4*4-a[3]*3*3-a[2]*2*2;
        if(a[1]>n1){
            result += (a[1]-n1+35)/36;
        }
        return result;

    }
}
