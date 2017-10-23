package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 搜狐畅游在线编程
 * @author wwh
 * @create 2017-09-17 10:50
 **/
public class souhuchangyou01 {
    public  static int getTotalCount(int month){
        int [] res=new int[month+2];
        res[1]=1;
        res[2]=1;
        res[3]=1;
        if(month<=3){
            return  res[month];
        }else{
            for (int i=4;i<=month;i++){
                res[i]=res[i-1]+res[i-2];
            }
            return res[month];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int month=sc.nextInt();
            System.out.println(getTotalCount(month));
        }

    }
}
