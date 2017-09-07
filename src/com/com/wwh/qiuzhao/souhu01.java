package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 搜狐秋招笔试在线编程01题
 * 【搜狐笔试题】Kolakoski数列
 * @author wwh
 * @create 2017-08-28 19:01
 **/
public class souhu01 {
    private static void kolakoski(int []data, int n){

         //data中的数据,遍历完之后，下一个循环开始
         int index=0;

         //控制结果输出数据的组数
         int indexSequence=0;

         //控制需要输出的kolakoski序列的长度
         int count=0;

         int [] res=new int[n];
         while (count<n){

             //开始下一组数据的循环
             res[count++]=data[index];

             int c=1;
             while (count<n&&c<res[indexSequence]){
                 res[count]=res[count-1];
                 c++;
                 count++;
             }

             indexSequence++;
             index++;
             //data中的数据遍历完一遍之后，如果还未达到输出的序列的长度则从第一个元素继续开始循环
             if(index==data.length)
                 index=0;
         }
            for(int ele:res){
                System.out.println(ele);
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] data = new int[m];
            for (int i = 0; i < m; i++) {
                data[i] = sc.nextInt();
            }
            kolakoski(data, n);
        }

        sc.close();
    }

}
