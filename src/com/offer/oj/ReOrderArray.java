package com.offer.oj;

/**
 * 调整数组中数字的位置奇数在前偶数在后
 * @author wwh
 * @create 2017/5/16
 */
public class ReOrderArray {
     /**
     * 第一个思路：类似冒泡算法，前偶后奇数就交换：
     * @param array
     */
    public void reOrderArray1(int [] array) {
        for(int i= 0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }

    /**
     * 建立一个数组，将元素从头到尾复制，通过后移使元素在合适的位置
     * @param array
     * @return
     */
    public static int [] reOrderArray(int [] array) {
        int []temp=new int[array.length];
        int odd=0;
        int even=0;
        for(int i=0;i<array.length;i++){
          if(array[i]%2==0){
              temp[even+odd]=array[i];
              odd++;
          }else{
              for (int j=odd+even;j>even;j--){
                  temp[j]=temp[j-1];
              }
              temp[even]=array[i];
              even++;
          }
        }
       /* for (int i=0;i<array.length;i++){
            array[i]=temp[i];
        }*/
        System.arraycopy(temp,0,array,0,array.length);
        return temp;
    }
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7};
     //   System.out.println(reOrderArray(array).toString());
        int []res=reOrderArray(array);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
}
