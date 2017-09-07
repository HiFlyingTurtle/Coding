package com.scut.chunzhao;
import java.util.Scanner;

/**
 * 京东笔试在线编程02
 * @author wwh
 * @create 2017-04-07 20:22
 **/
public class JD02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int res=0;
        if(k!=1){
        int t=n/(k+1+k);
        int m=n%(2*k+1);
                if(m<k){
                    res=t*2;
                }else if(m%2>=k){
                    res=t*2+1;
                }
        }else {

        }
        System.out.println(res);

    }
}
