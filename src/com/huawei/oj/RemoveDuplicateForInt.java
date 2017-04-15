package com.huawei.oj;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by WWH on 2017/3/10.
 */
public class RemoveDuplicateForInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Character> al=new ArrayList<>();
        String numStr=String.valueOf(num);
       for (int i=numStr.length()-1;i>=0;i--){
           if(!al.contains(numStr.charAt(i)))
               al.add(numStr.charAt(i));
       }
            for(char c:al){
                System.out.print(c);
            }


        sc.close();
    }
}
