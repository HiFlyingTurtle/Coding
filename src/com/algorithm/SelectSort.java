package com.algorithm;

/**
 * Created by WWH on 2017/3/20.
 * 选择排序是在每次排序之后将最小的元素放到最前面
 * 每次选择最小的元素，然后交换最小的元素到数组最前端
 * 冒泡是通过相邻元素的交换而选择是通过对整体的元素进行交换来实现排序
 * 选择排序是不稳定的是时间复杂度 O(n^2)
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] a={5,1,6,78,80,98};
        choiceSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void choiceSort(int [] a) {



        if (a == null || a.length <= 0) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int min = i; /* 将当前下标定义为最小值下标 */

            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) { /* 如果有小于当前最小值的关键字 */
                    min = j; /* 将此关键字的下标赋值给min */
                }
            }
            if (i != min) {/* 若min不等于i，说明找到最小值，交换 */
                int tmp = a[min];
                a[min] = a[i];
                a[i] = tmp;
            }
        }
    }
}
