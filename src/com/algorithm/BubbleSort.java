package com.algorithm;

/**
 * Created by WWH on 2017/3/10.
 * 冒泡排序可以使用字符串自带的compareTo来进行比较 按照字典顺序来进行比较
 * 排序的稳定性是指排序前后，关键字段相同的两个元素排序前后的位置不会发生改变
 * 冒泡是一种稳定的排序时间复杂度 在O(n^2)
 */
public class BubbleSort {
    public  static void bubbleSort(int [] array){
        if(array==null||array.length==0)
            return;
        for (int i=1;i<array.length;i++){
            //控制冒泡的趟数
            for (int j=0;j<array.length-i;j++){
                //与j+1比较，数组不能越界，最后一个元素的下一个位置
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }


    }

    /**
     * 在冒泡排序的过程中如果哪次遍历过程中没有发生交换
     * 那么就不必进行下一次的遍历
     * @param array
     */
    public static  void bubbleSortImproved(int [] array){
        if(array==null||array.length==0)
            return;
        boolean needNextPass=true;
        for (int k=1;k<array.length&&needNextPass;k++){
            needNextPass=false;
            for (int i=0;i<array.length-k;i++){
                if(array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;

                    needNextPass=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        String [] strA=new String[]{"cap","to","cat","card","two","too","up","boat","boot"};
        String temp=null;
        for(int i=0;i<strA.length-1;i++)
            for (int j=0;j<strA.length-1-i;j++)
            {
                if(strA[j].compareTo(strA[j+1])<0){
                    temp=strA[j];
                    strA[j]=strA[j+1];
                    strA[j+1]=temp;

                }
            }

        for (String str:strA){
            System.out.println(str);
        }
    }
}

