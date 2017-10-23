package com.com.wwh.qiuzhao;
import java.util.HashSet;
import java.util.Set;

/**
 * 平安秋招在线编程
 * @author wwh
 * @create 2017-10-11 21:35
 **/
public class PingAn01 {
    public  static  boolean appearOnceOrTwice(String str){
        Set<Character> set=new HashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        if(set.size()==3)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int count=0;
        for(int i=3000;i<4000;i++){
            String str=String.valueOf(i);
            if(appearOnceOrTwice(str)) count++;
        }
        System.out.println(count);
    }
}
