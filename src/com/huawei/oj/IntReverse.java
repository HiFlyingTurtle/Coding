package com.huawei.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/10.
 */
public class IntReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String numStr=String.valueOf(number);
        for (int i=numStr.length()-1;i>=0;i--){
            System.out.print(numStr.charAt(i));
        }

        sc.close();
    }
}
