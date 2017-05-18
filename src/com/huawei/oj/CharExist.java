package com.huawei.oj;

import java.util.Scanner;

/**
 * 华为在线编程短字符串是否在长字符串中存在
 * @author wwh
 * @create 2017/5/18
 */
public class CharExist {
    public static boolean isAllCharExist(String shortStr,String longStr){
        boolean flag=false;
        int i;
        for(i=0;i<shortStr.toCharArray().length;i++){
            if(longStr.indexOf(shortStr.toCharArray()[i])<0){
                flag=false;
                break;
            }
        }
        if(i==shortStr.toCharArray().length) {flag=true;}

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String shortStr=sc.nextLine();
            String longStr=sc.nextLine();
            System.out.println(isAllCharExist(shortStr,longStr));
        }

    }
}
