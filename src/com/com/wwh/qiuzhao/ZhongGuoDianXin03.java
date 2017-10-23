package com.com.wwh.qiuzhao;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 中国电信在线编程题
 * @author wwh
 * @create 2017-09-24 17:57
 **/
public class ZhongGuoDianXin03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int length = sc.nextInt();
            int[] temp = new int[length];
            TreeSet<Integer> set = new TreeSet<Integer>();
            int ele = 0;
            for (int i = 0; i < length; i++) {
                ele = sc.nextInt();
                temp[i] = ele;
                set.add(ele);
            }

            int[] result = new int[length];
            for (int i = 0; i < length; i++) {
                int pos = 1;
                for (Integer data : set) {
                    if (temp[i] == data) {
                        result[i] = pos;
                        break;
                    } else {
                        pos++;
                    }
                }
            }

            for (int i = 0; i <length-1 ; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println(result[length-1]);

        }
    }
}
