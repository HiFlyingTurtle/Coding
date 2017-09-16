package com.scut.wwh;

import java.util.Stack;

/**
 * Created by wwh on 2017/5/13.
 */
public class cms {
    public static int[] quickSort_not_recursion(int[] result) {
        int i;
        int j;
        int min;    // Every loop's max index
        int max;    // Every loop's minus index
        int key;

        Stack<Integer> conditions = new Stack<Integer>();   // Record the minus index and the max index
        conditions.push(0);
        conditions.push(result.length-1);
        int temp;

        // In every loop will get a left index and right index.
        while(!conditions.empty()){
            max = conditions.pop();
            min = conditions.pop();
            key = result[min];
            i = min+1;
            j = max;

            // With this step, the numbers can be divided to 2 sections,
            // the left side is smaller than the key value,
            // the right side is bigger than the key value.
            while(i<j) {
                // Get the number's index which is smaller than key
                while (key < result[j] && i<j) {
                    j--;
                }

                // Get the number's index which is bigger than key
                while (key > result[i] && i<j) {
                    i++;
                }

                // Swap
                temp = result[j];
                result[j] = result[i];
                result[i] = temp;
            }

            // Swap the key and i(or j)
            if(key>result[i]){
                temp = result[min];
                result[min] = result[j];
                result[j] = temp;
            }

            // Store the left side minus index and the max index
            if(min<i-1){
                conditions.push(min);
                conditions.push(i-1);
            }

            // Store the right side minus index and the max index
            if(max>i+1){
                conditions.push(i+1);
                conditions.push(max);
            }
        }

        return result;
    }
    private static void quickSort(int[] array){
        if(array.length == 0)
            return;
        quickSortCore(array);
        print(array);
    }
    private static void quickSortCore(int[] array){
        Stack<Node> s = new Stack<>();
        Node top = null;
        s.push(new Node(0, array.length - 1));
        while(!s.isEmpty()){
            top = s.pop();
            int left = top.left;
            int right = top.right;
            int leftIndex = partition(left , right , array);
            if(leftIndex - 1 >= left)
                s.push(new Node(left , leftIndex - 1));
            if(leftIndex + 1 <= right)
                s.push(new Node(leftIndex + 1 , right));
        }
    }
    /**
     *划分函数
     */
    private static int partition(int left , int right , int[] array){
        int key = array[left];
        int storeLeft = left;
        while(left <= right){
            while(left <= right && key >= array[left])
                left++;
            while(left <= right && key < array[right])
                right--;
            if(left <= right)
                swap(left , right , array);
        }
        if(left == storeLeft)
            return left;
        swap(left - 1 , storeLeft , array);
        return left - 1;
    }
    private static void swap(int left , int right , int[] array){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
    private static void print(int[] array){
        for(int ele : array){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int [] a={5,2,6,9,5,3,4,6,5};
        quickSort(a);


    }
}
 class Node{
    public int left;
    public int right;
    public Node(int left , int right){
        this.left = left;
        this.right = right;
    }
}
