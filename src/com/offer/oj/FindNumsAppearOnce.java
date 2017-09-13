package com.offer.oj;

/**
 * 在数组中查找只出现了一次的数组
 *
 * @author wwh
 * @create 2017-09-08 11:05
 **/
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int result = 0;
        for(int i=0;i<array.length;i++){//异或结束相当于两个数异或的结果
            result ^= array[i];
        }
        //找出这两个数的第一个相异位置
        int count =1;
        int i=1;

        while(true){
            if((result&i)==1){
                break;
            }

           result=result>>1;
           count=count<<1;
        }
        //按照这个位置把数组分成两组
        num1[0] = 0;
        num2[0] = 0;

        for(int j=0;i<array.length;i++){
            if((array[i]&count)==0){
                num1[0] ^= array[j];
            }else{
                num2[0] ^= array[j];
            }
        }

    }
    public static void main(String[] args) {

    }
}
