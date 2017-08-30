package com.com.wwh.qiuzhao;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 今日头条校园招聘编程第一题
 * @author wwh
 * @create 2017-08-22 18:12
 **/
public class TouTiao01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            Point [] p=new Point[n];

            for (int i=0;i<n;i++){
               int x=sc.nextInt();
               int y=sc.nextInt();
                Point pt=new Point(x,y);
                p[i]=pt;
            }

            Arrays.sort(p, new Comparator<Point>() {
                @Override
                public int compare(Point p1, Point p2) {
                      return p1.x-p2.x;
                }
            });

            Point [] res=new Point[n];
            int count=0;
            int maxy=-1;
            for(int j=n-1;j>=0;j--){
                if(p[j].y>maxy){
//                  Point px=new Point(p[j].x,p[j].y);
                    maxy=p[j].y;
                    res[count++]=p[j];
                }
            }

            for(int k=count-1;k>=0;k--){
                System.out.println(res[k].x+" "+res[k].y);
            }

        }
        sc.close();
    }


    static class  Point{
        int x;
        int y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
