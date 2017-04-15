package com.algorithm;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by WWH on 2017/3/10.
 */
public class TreeSetSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        TreeSet<String> ts=new TreeSet<>();
        String temp=null;
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                temp=sc.nextLine();
                ts.add(temp);
            }

            for (String s:ts){
                System.out.println(s);
            }
        }
    }

}
