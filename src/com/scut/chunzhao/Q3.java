package com.scut.chunzhao;
import java.util.Scanner;

/**
 * 在线编程3
 * 魔力手环
 * @author wwh
 * @create 2017-03-25 15:23
 **/
public class Q3 {
    public static  int mod(int number){
        int result=0;
        if(number>=100){
            result=number%100;
        }else {
            result=number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []circle=new int[n];
            for(int i=0;i<circle.length;i++){
                circle[i]=0;
            }
            for(int i=0;i<n;i++){
                circle[i]=sc.nextInt();
            }
            while (k>0){
                int temp=circle[0];
                for(int j=0;j<circle.length;j++){
                    if(j==circle.length-1){
                        circle[j]=circle[j]+temp;
                    }else{
                        circle[j]=circle[j]+circle[j+1];
                    }
                    if(circle[j]>=100) circle[j]=mod(circle[j]);

                }
                k--;
            }

            for (int m=0;m<circle.length-1;m++){
                System.out.print(circle[m]+" ");
            }
            System.out.print(circle[circle.length-1]);

        }
        sc.close();
    }
}
