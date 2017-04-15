package com.algorithm;

/**
 * Created by WWH on 2017/3/30.
 */
public class MergeSortOptimization {

    public static final int THRESHOLD=25;

    //优化的归并排序两个有序子序列归并，右子序逆置了，都从两端向中间扫描，归并到新数组
    public static void OPtiMerge(int [] Array,int [] TempArray,int left,int right,int middle)
    {
        int index1,index2;
        int i,j,k;
        for(i=left;i<=middle;i++)
        {
            TempArray[i]=Array[i];      //复制左边的子序列
        }
        for(j=1;j<=right-middle;j++)
        {
            TempArray[right-j+1]=Array[j+middle];   //复制右边的子序列，但顺序颠倒过来

        }
        //开始归并，取较小者插入合并数组中
        for(index1=left,index2=right,k=left;k<=right;k++)
            if(TempArray[index1] <= TempArray[index2])
                Array[k]=TempArray[index1++];
            else
                Array[k]=TempArray[index2--];
    }

    public static  void OPtiMergeSort(int []Array, int []TempArray,int left,int right)
    {
        int middle;

        if(right-left+1 > THRESHOLD) //如果序列长度大于阀值(28),递归进行归并
        {
            middle=(left+right)/2;
            OPtiMergeSort(Array, TempArray, left, middle);  //对左边一半进行递归
            OPtiMergeSort(Array, TempArray, middle + 1, right);   //对右边一半进行递归
            OPtiMerge(Array,TempArray,left,right,middle);    //进行归并
        }
        else {
            InsertSort(Array,right-left+1); //小长度子序列列进行插入排序
        }
    }
    //直接插入排序
    public static void InsertSort(int []Array,int length)
    {
        int Temp;
        int i,j;
        for(i=1;i<length;i++)
        {
            Temp=Array[i];
            j=i-1;
            while(j>=0 && Temp< Array[j])
            {
                Array[j+1]=Array[j];
                j=j-1;
            }
            Array[j+1]=Temp;
        }
    }


    public static void main(String[] args) {
        int []Array={8,2,4,7,6,1,9,3,5,0,23,10,25,11,18,12,17,24,13,15,22,16,14,19,21,20,29,28,26,27};
        int []TempArray=new int[30];
        OPtiMergeSort(Array,TempArray,0,Array.length-1);

        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+" ");
        }


    }



}
