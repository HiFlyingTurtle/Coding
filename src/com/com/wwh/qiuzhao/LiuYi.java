package com.com.wwh.qiuzhao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 拼多多第三题
 * @author wwh
 * @create 2017-08-01 21:09
 **/
public class LiuYi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();

            int [] h=new int[n];
            for(int i=0;i<n;i++){
                h[i]=sc.nextInt();
            }

            int m=sc.nextInt();
            int [] w=new int[m];
            for(int j=0;j<m;j++){
                w[j]=sc.nextInt();
            }

            int count=0;
            Arrays.sort(w);
            Arrays.sort(h);

            for(int i=n-1,j=m-1;i>=0&&j>=0;){
                if(w[j]>=h[i]){
                    i--;
                    j--;
                    count++;
                }else {
                    i--;
                }
            }
            System.out.println(count);
        }

    }
}
