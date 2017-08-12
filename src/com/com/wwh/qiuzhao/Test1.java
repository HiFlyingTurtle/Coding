package com.com.wwh.qiuzhao;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 拼多多第一题
 * @author wwh
 * @create 2017-08-01 20:00
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int [] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }

            Arrays.sort(array);
            int len=array.length;
            int m=3;
            long now1,now2;
            long sum=1;
            for(int i=len-1,j=0;i>=j&&m!=0;i--){
                now1=array[i]*array[i-1];
                now2=array[j]*array[j+1];
                if(now1<=now2&&m>=2){
                    sum=sum*now2;
                    i++;
                    j=j+2;
                    m=m-2;
                }else {
                    sum=sum*array[i];
                    m--;
                }
            }
            System.out.println(sum);
        }

    }
}
