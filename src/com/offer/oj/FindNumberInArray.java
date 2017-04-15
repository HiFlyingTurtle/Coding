package com.offer.oj;

/**
 * 利用二分查找来进行查找但是时间复杂度过高 nLogN 不满足需求  运行时间太长
 * Created by WWH on 2017/3/21.
 */
public class FindNumberInArray {
    public static  boolean Find1(int target, int [][] array) {
        int low,high,mid;
        for (int i=0;i<array.length;i++){
                 low=0;
                 high=array[i].length;
                while (low<=high){
                    mid=(low+high)/2;
                    if(target==array[i][mid])
                        return true;
                    else if(target<array[i][mid]) high=mid-1;
                       else low=mid-1;
                }
            }
       return false;
    }

     /**
     * 从坐下角开始找，往上是递减，往右是递增
     * @param target
     * @param array
     * @return
     */
    public static  boolean Find(int target, int [][] array) {
        //开始找的起点
        int x=array.length-1;
        int y=0;
        int width=array[0].length;
        while (x>=0&&y<width){
            if(array[x][y]==target)
                return true;
            else if(array[x][y]>target){
                //向上移动
                x=x-1;
            }else {
                //向右移动
                y=y+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {


    }
}
