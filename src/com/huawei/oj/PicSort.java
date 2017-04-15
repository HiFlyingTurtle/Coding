package com.huawei.oj;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by WWH on 2017/3/16.
 */
public class PicSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String text=sc.nextLine();
            char[] ca=text.toCharArray();
            Arrays.sort(ca);
            for (int i=0;i<ca.length;i++){
                System.out.print(ca[i]);
            }
            System.out.println();
        }
        sc.close();
     }
}
