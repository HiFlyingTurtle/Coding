package com.scut.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 360在线编程第三题
 * @author wwh
 * @create 2017-03-25 18:51
 **/
public class Q3603 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []taskList=new int[n];
        int []tempTask=new int[m];
        for (int i=0;i<n;i++){
            taskList[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            tempTask[i]=sc.nextInt();
        }

        int []privot=new int[n];
        Arrays.sort(taskList);
        int count=0;
        for(int j=0;j<taskList.length-1;j++){
//            if((taskList[j]+1)!=taskList[j+1]){
//                privot[count++]=taskList[j+1]-1;
//            }
            if((taskList[j]+1)!=taskList[j+1]){
                for(int temp=taskList[j];temp<taskList[j]+1;temp++){
                    privot[count++]=temp+1;
                }
            }
        }
        privot[count]=taskList[taskList.length-1]+1;

        Map<Integer,Integer> map=new HashMap<>();
               for(int k=0;k<tempTask.length;k++){
                   for(int t=0;t<privot.length;t++){
                       if(tempTask[k]<=privot[t]){
                           map.put(tempTask[k],privot[t]);
                           break;
                       }
                   }
               }


        for(int r=0;r<tempTask.length;r++){
            System.out.println(map.get(tempTask[r]));
        }


    }
}
