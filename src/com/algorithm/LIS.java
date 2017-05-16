package com.algorithm;
/**
 * 最长递增子序列
 * @author wwh
 * @create 2017-05-12 13:13
 **/
public class LIS {
      /**
     *求最长递增子序列的长度
     * @param a
     * @return
     */
    public int lis(int a[]){
        int maxLength=0;
        //dp(i)表示 L中以a[i]为末尾元素的最长递增子序列的长度.
        int [] dp=new int[a.length];
        for (int i=0;i<a.length;i++){
            dp[i]=1;
            for (int j = 0; j <i ; j++) {
                if(a[i]>a[j]&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    if(dp[i]>maxLength){
                        maxLength=dp[i];
            }

        }

            }

        }

       /* for(int k=0;k<dp.length;k++){
            System.out.print(dp[k]+" ");

        }
        System.out.println();*/
        return maxLength;
    }

     /**
     * 求最长的连续自增子序列
     * @param a
     * @return
     */
    public int longestSubSequence(int a[]){
        int current=1;
        int res=1;
        for (int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                current++;
            }else{

                current=1;
            }
            if(current>res){
                res=current;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int []a={116,126,150,200,210,130,197,200};
        LIS li=new LIS();
        System.out.println(li.longestSubSequence(a));
    }
}
