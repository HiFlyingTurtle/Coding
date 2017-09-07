package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 网易秋招内推编程第一题
 * 独立的小易
 * https://www.nowcoder.com/discuss/36124
 * @author wwh
 * @create 2017-08-12 14:14
 **/
public class NetEase01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int x=sc.nextInt();
            int f=sc.nextInt();
            int d=sc.nextInt();
            int p=sc.nextInt();
            int days=0;
            while(d>=x){
                d-=x;
                if(f-1==0){
                    d-=p;
                }else{
                    f--;
                }
                days++;
            }
            System.out.println(days);
//            int days=0;
//            int fx=f*x;
//            int dl=d-fx;
//            if(dl<=0) days=f;
//            else{
//                days=f;
//                days+=dl/(x+p);
//            }

        }

    }
}
