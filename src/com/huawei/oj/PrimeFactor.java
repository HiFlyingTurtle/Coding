package com.huawei.oj;

import java.util.Scanner;
/**
 * Created by WWH on 2017/3/14.
 */
public class PrimeFactor {
    public  static String getResult(long ulDataInput){
        StringBuffer sb=new StringBuffer();
        for(long i=2;i<=ulDataInput;i++){
            if(ulDataInput==i){
                sb.append(ulDataInput+" ");
                break;
            }
            while(ulDataInput%i==0){
                ulDataInput/=i;
                sb.append(i + " ");
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        if (num<2){
            sc.close();
            return;
        }
        System.out.println(getResult(num));
        sc.close();
    }
}
