package com.com.wwh.qiuzhao;

import java.util.Scanner;
import java.util.Stack;

/**
 * 快排的非递归实现
 * @author wwh
 * @create 2017-09-16 19:36
 **/
public class QuickSortNoRecursion {
    public static void QuickSortNoRecursion(int[] array) {
        if (array == null || array.length == 1) return;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        stack.push(array.length - 1);
        while (!stack.empty()) {
            int right = stack.pop();
            int left = stack.pop();
            if (right <= left) continue;

            int i = partition(array, left, right);
            if (left < i - 1) {
                stack.push(left);
                stack.push(i - 1);
            }
            if (i + 1 < right) {
                stack.push(i + 1);
                stack.push(right);
            }
        }
    }

    public static int partition (int[] data, int start, int end)
    {
        int temp;
        int i=start,j=end;
        if(start<end)
        {
            temp=data[i];
            while(i<j)
            {
                while(j>i&&data[j]>temp)j--;
                if(i<j)
                {
                    data[i]=data[j];
                    i++;
                }
                while(i<j&&temp>data[i])i++;
                if(i<j)
                {
                    data[j]=data[i];
                    j--;
                }
            }
            data[i]=temp;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            int [] array=new int[num];
            for(int i=0;i<num;i++){
                array[i]=sc.nextInt();
            }
            QuickSortNoRecursion(array);

            for (int i=0;i<array.length-1;i++){
                System.out.print(array[i] + " ");
            }

            System.out.print(array[array.length-1]);
        }
    }

}
