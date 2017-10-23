package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 招行信用卡02
 * @author wwh
 * @create 2017-09-13 20:00
 **/
public class ZhaoHangXinYongKa02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            int [] height=new  int[m];
            for(int i=0;i<m;i++){
                height[i]=sc.nextInt();
            }
            System.out.println(WinOrLose(height, 0, 0, 0, 1));
        }
    }

    public static boolean WinOrLose(int[] height,int left,int ls,int rs,int player){
        if(left==height.length){
            return ls>rs;
        }
        if(player==1){
            boolean result1=WinOrLose(height, left + 1, ls + height[left], rs, 2);
            boolean result2=false;
            if(left+1<height.length){
                result2=WinOrLose(height, left + 2, ls + height[left] + height[left + 1], rs, 2);
            }
            return result1||result2;
        }else {
            boolean result1=WinOrLose(height, left + 1, ls, rs + height[left], 1);
            boolean result2=true;
            if(left+1<height.length){
                result2=WinOrLose(height, left + 2, ls, rs + height[left] + height[left + 1], 1);
            }
            return result1&&result2;
        }
    }
}
