package com.scut.chunzhao;
import java.util.Scanner;

/**
 * 完美世界在线编程第一题
 *
 * @author wwh
 * @create 2017-03-29 18:57
 **/
public class WanMei01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []w=new int[n];
        int []v=new int[n];
        for (int i=0;i<n;i++){
            v[i]=sc.nextInt();
        }

        for (int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }

        int c=sc.nextInt();

        double[] r=new double[n];
        int []index=new int[n];
        for (int i=0;i<n;i++){
            r[i]=(double)v[i]/w[i];
            index[i]=i;
        }
        double temp=0;
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(r[i]<r[j])
                {
                    temp=r[i];
                    r[i]=r[j];
                    r[j]=temp;
                    int x=index[i];
                    index[i]=index[j];
                    index[j]=x;
                }
            }
        }

        int []w1=new int[n];
        int []v1=new int[n];
        for (int i=0;i<n;i++){
            w1[i]=w[index[i]];
            v1[i]=v[index[i]];
        }

        int []x=new int[n];
        for (int i=0;i<n;i++){
            x[i]=0;
        }

        for (int i=0;i<n;i++){
            if(w1[i]<=c){
                x[i]=1;
                c=c-w1[i];
            }
        }

        int maxValue=0;
        for (int i=0;i<n;i++){
            if(x[i]==1){
                maxValue+=v1[i];
            }
        }
        System.out.println(maxValue);

    }
}
