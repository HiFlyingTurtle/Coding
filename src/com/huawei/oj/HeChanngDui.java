package com.huawei.oj;
import java.util.Scanner;
/**
 * 华为OJ在线编程合唱队
 * 还未完成编程
 * @author wwh
 * @create 2017-04-08 16:24
 **/
public class HeChanngDui {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int low=0,high=0;
        int length=0;
        for(int i=0;i<n-1;i++){
            if(height[i]<height[i+1]){
                low=i;
            }
            boolean flag=true;//表示递增

            while(low<n){
                if(height[low]<height[low+1]&&flag){
                    low++;
                    flag=true;
                }else {
                    high=low;
                    break;
                }

                if(height[low]>height[low+1]){
                    low++;
                    flag=false;
                }

            }
        }

    }
}
