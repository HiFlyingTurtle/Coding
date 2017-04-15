package com.algorithm;

/**
 * Created by WWH on 2017/3/14.
 */
public class Test {
    public static  int resolve(int a[]){
        int b[]={0,0,0,0};
        int sum=0;
        int hegiht=a[a.length-1]/100;
        while(hegiht>0){
            for(int i=0;i<a.length;i++){
                if(a[i]/100==hegiht) b[hegiht-1]++;
            }
        }

        return sum;

    }
    public static void main(String[] args) {
        int a[]=new int[]{113,215,224};
        resolve(a);


    }
}
