package com.scut.test;
import java.util.*;
/**
 * 百度春招在线编程01
 * @author wwh
 * @create 2017-04-27 19:31
 **/
public class BaiDu01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> ts=new TreeSet<>();
        List<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ts.add(sc.nextInt());
        }
        if(ts.size()>=3){
            for (Integer el:ts){
                list.add(el);
            }
            System.out.println(list.get(2));
        }else {
            System.out.println(-1);
        }

    }
}
