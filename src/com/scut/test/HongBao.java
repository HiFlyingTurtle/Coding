package com.scut.test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 发红包
 * @author wwh
 * @create 2017-03-19 19:47
 * 人人网机试题
 **/
public class HongBao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        while (sc.hasNext()){
            int n=sc.nextInt();

            for(int i=0;i<n;i++){
                String name=sc.next();
                map.put(name,0);
            }

            for(int t=0;t<n;t++) {
                String sname = sc.next();
                int mi = sc.nextInt();
                int ki = sc.nextInt();


                int balance = map.get(sname) - mi;
                map.put(sname, balance);
                if(ki==0)  return;
                    if (mi % ki == 0) {
                        for (int j = 0; j < ki; j++) {
                            int AvgMoney = mi / ki;
                            String rname = sc.next();
                            //遍历HashMap找到收红包的人
                            for (String key : map.keySet()) {
                                if (rname.equals(key)) {
                                    Integer temp = map.get(key) + Integer.valueOf(AvgMoney);
                                    map.put(key, temp);
                                }
                            }
                        }
                    } else {
                        for (int j = 0; j < ki; j++) {
                            int k = mi % ki;
                            int avgMoney = (mi - k) / ki;
                            int bal = +map.get(sname);
                            map.put(sname, Integer.valueOf(k + bal));
                            String rname = sc.next();
                            //遍历HashMap找到收红包的人
                            for (String key : map.keySet()) {
                                if (rname.equals(key)) {
                                    Integer temp = map.get(key) + Integer.valueOf(avgMoney);
                                    map.put(key, temp);
                                }
                            }
                        }
                    }

            }

            }
         for (String str:map.keySet()){
                System.out.println(str + " " + map.get(str));
            }

        }

}


