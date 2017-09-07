package com.scut.chunzhao;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 百度春招在线编程02
 * @author wwh
 * @create 2017-04-27 19:53
 **/
public class BaiDu02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Point> map=new HashMap<>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String key=sc.next();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            System.out.println(key+x+" "+y+" "+z);
            Point p=new Point(x,y,z);
            map.put(key,p);
        }

        System.out.println(map.size());



    }
}

class Point{
    int x;
    int y;
    int z;

    Point(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}