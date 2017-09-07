package com.scut.chunzhao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 360笔试第二题
 * @author wwh
 * @create 2017-03-29 18:32
 **/
public class Q3602 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String T = sc.next();
            int count = 0;
            int gi = 0;
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            map.put(0, 1);
            for(int i=0; i<T.length(); i++){
                int x = T.charAt(i) - 'a';
                gi ^= (1 << x);
                if(map.containsKey(gi)){
                    count += map.get(gi);
                    map.put(gi, map.get(gi)+1);
                }else{
                    map.put(gi, 1);
                }

            }
            System.out.println(count);
        }

    }
}
