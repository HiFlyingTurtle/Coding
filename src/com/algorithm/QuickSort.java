package com.algorithm;

/**
 * Created by WWH on 2017/4/2.
 * 快速排序的实现
 * 是一种不稳定的排序算法 时间复杂度O(nlogn)
 * 常见的稳定排序算法：插入，冒泡，选择 基数
 * 快速排序的思想:该算法在数组中选择一个称为主元的元素将数组分为两个部分，
 * 时得第一部分的元素都小于主元，第二部分的元素都大于主元 对第一部分和第二部分分别递归的应用快速排序算法
 */
public class QuickSort {
    public static void quickSort(int []list){
        quickSort(list,0,list.length-1);
    }

    public  static void quickSort(int [] list,int first,int last){
        if(last>first){
            int privotIndex=partition(list, first, last);
            quickSort(list,first,privotIndex-1);
            quickSort(list,privotIndex+1,last);
        }
    }

    /** Partition the array list[first..last] */

    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list[low] <= pivot)
                low++;

            // Search backward from right
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        quickSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}
