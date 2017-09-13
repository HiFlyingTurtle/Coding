package com.com.wwh.qiuzhao;

/**
 * 爱奇艺在线编程平方根
 * 两个数开方之后的和的平凡为整数
 * 3 8
 * 5
 * @author wwh
 * @create 2017-09-10 21:01
 **/
import java.util.HashMap;
import java.util.Scanner;

public class AiQiYi01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(solve(a,b));
    }

    private static int solve(int a, int b) {
        HashMap<Integer,Integer> map1=new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> map2=new HashMap<Integer, Integer>();

        for(int i=1;i<=a;i++){
            getTarget(i,map1);
        }
        for(int j=1;j<=b;j++){
            getTarget(j,map2);
        }
        int res=0;
        for(Integer key:map1.keySet()){
            if(map2.containsKey(key)){
                res+=map1.get(key)*map2.get(key);
            }
        }
        return res;
    }

    public static void getTarget(int k,HashMap<Integer,Integer> map){
        for(int i=(int) Math.sqrt(k);i>0;i--){
            if(k%(i*i)==0){
                Integer a=map.get(k/(i*i));
                if(a==null) a=0;
                map.put(k/(i*i),a+1);
                return;
            }
        }
    }
}
