package com.algorithm;
/**
 * Created by WWH on 2017/3/30.
 * 归并排序的实现
 */
public class MergeSort {
     /**
     * 归并排序
     * @param array
     */
    public static void  mergeSort(int[] array){
        if(array.length>1){
            //数组的左半部分
            int[] leftArray=new int[array.length/2];
            System.arraycopy(array,0,leftArray,0,array.length/2);
            mergeSort(leftArray);

            //数组的右半部分
            int rightLength=array.length-array.length/2;
            int []rightArray=new int[rightLength];
            System.arraycopy(array,array.length/2,rightArray,0,rightLength);
            mergeSort(rightArray);

            //合并左右部分的数组到数组中
            merge(leftArray,rightArray,array);
        }

    }

     /**
     * 采用二路归并来进行合并两个部分
     * @param leftArray
     * @param rightArray
     * @param temp
     */
    public  static void merge(int [] leftArray,int [] rightArray,int [] temp){
        int left=0;
        int right=0;
        int te=0;
        while (left<leftArray.length&&right<rightArray.length){
            if(leftArray[left]<rightArray[right])
                temp[te++]=leftArray[left++];
            else
                temp[te++]=rightArray[right++];
        }

        while (left<leftArray.length){
            temp[te++]=leftArray[left++];
        }

        while (right<rightArray.length){
            temp[te++]=rightArray[right++];
        }

    }

    public static void main(String[] args) {
        int []array={10,3,2,5,6,1,-2,76,14,12};
        mergeSort(array);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
