package com.huawei.oj;

import java.util.HashSet;
import java.util.Scanner;
/**
 * Created by WWH on 2017/3/10.
 */
public class CountChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        HashSet<Character> hs=new HashSet<>();
        for(char ch:text.toCharArray()){
            if(ch>=0&&ch<=127){
                hs.add(ch);
            }
        }
        System.out.println(hs.size());
        sc.close();
    }
}
