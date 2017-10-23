package com.com.wwh.qiuzhao;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 字符串加密
 * @author wwh
 * @create 2017-09-16 20:43
 **/
public class Secert {

    public static HashMap<Character,Integer> map=new HashMap<>();
    static {
        for(int i=0;i<26;i++){
            map.put((char)(97+i),i+1);
        }
    }
    public static   int getNumber(String input){
        int res=0;
        if(input.length()==1)
            return map.get(input.toCharArray()[0]);
        else {
            for (int i = 0; i < input.toCharArray().length; i++) {
                res += Math.pow(26, map.get(input.toCharArray()[i]) - 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                String input=sc.next();
                System.out.println(getNumber(input));
            }


        }
    }
}
