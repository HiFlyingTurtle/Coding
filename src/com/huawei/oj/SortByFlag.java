package com.huawei.oj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * Created by WWH on 2017/3/17.
 */
public class SortByFlag {

  public static void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag){
      if(iSortFlag==0){
          //升序
          Arrays.sort(pIntegerArray);
      }else {
          //降序
          Arrays.sort(pIntegerArray,new DescendSort());
      }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            Integer[] array=new Integer[num];
            for (int i=0;i<num;i++){
                array[i]=sc.nextInt();
            }

            int flag=sc.nextInt();
            sortIntegerArray(array,flag);
            for(int i=0;i<array.length-1;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println(array[array.length-1]);

        }

    }
}
//降序排列
 class DescendSort implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
      return -(o1-o2);
    }
}
