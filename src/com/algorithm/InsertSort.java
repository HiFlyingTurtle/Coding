package com.algorithm;

/**
 * Created by WWH on 2017/3/16.
 * 插入排序是通过对元素的比较找到合适的位置来进行插入
 * 时间复杂度 O(n^2) 稳定的
 */
public class InsertSort {
    public static  void InsertionSort(int array[]){
        if(array==null||array.length==0)
            return;
        int temp;
        int k,j;
        for ( k = 1; k < array.length; k++) {
            temp=array[k];
            for( j=k-1;j>=0;j--){
                if (temp<array[j]){
                    array[j+1]=array[j];
                }else break;
            }
            array[j+1]=temp;

        }

    }

    //插入排序的实现
    public static void insertSort1(int [] array){
        if(array==null||array.length==0)
            return;
        for(int i=1;i<array.length;i++){
            int j=i;
            int target=array[i];
            while (j>0&&target<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=target;

        }


    }

    public static void insertSort(int [] array){
        if(array==null||array.length==0)
            return;
        for(int i=0;i<array.length;i++){
            for (int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]=new int[]{34,8,64,51,32,21};
        insertSort(a);
       for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
