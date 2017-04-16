package com.scut.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 集齐五福
 * @author wwh
 * @create 2017-03-17 19:12
 **/
public class FU {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int [] a={0,0,0,0,0};
        while(sc.hasNext()){
                String text = sc.nextLine();
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == '1') {
                        a[i]++;
                    }
            }
        }
        Arrays.sort(a);
        System.out.println(a[0]);
    }
}
