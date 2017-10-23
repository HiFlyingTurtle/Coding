package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 幸运数字
 * @author wwh
 * @create 2017-09-20 15:47
 **/
public class ShunFeng01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []a=new int[n+1];
            int []b=new int[n+1];
            for (int i = 1; i <=n ; i++) {
                a[i]=sc.nextInt();
            }

            for(int pos=n;pos>=1;pos--){
                b[pos]=a[pos];
                int temp=1;
                for(int t=pos+1;t<=n;t++){
                    b[pos]+=temp*b[t];
                    temp=temp*-1;
                }
            }

            for (int i = 1; i <=n ; i++) {
                System.out.println(b[i]);
                
            }


        }
    }

}
