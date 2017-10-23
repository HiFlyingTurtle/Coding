package com.com.internet.oj;

import java.util.Arrays;
/**
 * 数组的全排列
 * 求数组中集合元素的全排列
 * @author wwh
 * @create 2017-10-12 14:04
 **/
public class AllSort {
    public static void swap(int [] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    public static void allSort(int [] array,int begin,int end ){
        if(begin==end){
            System.out.println(Arrays.toString(array));
            return ;
        }

        for(int i=begin;i<=end;i++){
                swap(array,begin,i);
                allSort(array,begin+1,end);
                swap(array,begin,i);
        }
    }
    public static void main(String[] args) {

    }

}
