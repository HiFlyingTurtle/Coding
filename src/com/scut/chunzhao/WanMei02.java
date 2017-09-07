package com.scut.chunzhao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 完美世界在线编程第二题
 *
 * @author wwh
 * @create 2017-03-29 18:57
 **/
public class WanMei02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int flag=-1;
        while(sc.hasNext()){
            list.add(sc.nextInt());
            int value=sc.nextInt();
            Collections.sort(list);

            int max=list.get(list.size()-1);
            if(value%max==0){
                flag=value/max;
            }else {
                int count=0;
                int i=0;
                for (i=list.size()-1;i>=0;i--){
                    if(value==0) {flag=count;break;}
                    count+=value/list.get(i);
                    value=value%list.get(i);
                }

                if(value!=0&&i<=0){
                    flag=-1;
                }
            }

            System.out.println(flag);

        }
    }

}
