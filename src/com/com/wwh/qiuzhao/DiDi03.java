package com.com.wwh.qiuzhao;
import java.util.HashMap;
import java.util.Scanner;
/**
 * 秋招在线编程
 * @author wwh
 * @create 2017-09-10 15:59
 **/
public class DiDi03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int [] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
             int []dp=new int[n+1];
             map.put(0,0);
             int res=0;
             int count=0;
             for(int i=0;i<n;i++){
                 res=res^array[i];
                 if(map.containsKey(res)){
                     int temp=map.get(res)!=null?map.get(res):0;
                     dp[i]=Math.max(count,dp[temp]+1);
                 }else {
                     dp[i]=count;
                 }
                 count=Math.max(count,dp[i]);
                 map.put(res, i);
             }

            System.out.println(count);
        }
    }
}
/**
 *
 int res = 0;
 int start = 0;
 for (int i = 0; i < n; i++) {
 if (arr[i] == 0) {
 res++;
 start = i;
 } else {
 int tem = i - 1;
 int count = arr[i];
 while (tem >= start && count != 0) {
 count ^= arr[tem--];
 }
 if (count == 0) {
 res++;
 start = i;
 }
 }
 }

 作者：小小的菜鸡
 链接：https://www.nowcoder.com/discuss/39643?type=0&order=0&pos=9&page=1
 来源：牛客网

 int lastId = 0;
 int count = 0;
 for(int i = 0 ; i < n ; i++)
 {
 int temp = 0;
 for(int j = i; j >= lastId ; j--){
 temp = temp ^ a[j];
 if(temp == 0) {
 lastId = i + 1;
 count++;
 break;
 }

 }
 }
 System.out.println(count);

 */
