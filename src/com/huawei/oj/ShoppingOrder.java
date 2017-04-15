package com.huawei.oj;
import java.util.Scanner;
/**
 * Created by WWH on 2017/4/5.
 * 购物订单
 * 使用动态规划来进行求解背包问题
 */
public class ShoppingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //商品的总价格
        int n=sc.nextInt();
        //商品的个数
        int m=sc.nextInt();

        //商品价格
        int []p=new int[m];
        //商品价值
        int[]v=new int[m];
        //商品主件还是附件
        int []q=new int[m];
        for (int i=0;i<m;i++){
            p[i]=sc.nextInt();
            v[i]=sc.nextInt()*p[i];
            q[i]=sc.nextInt();
        }

        int [][]dp=new int[m+1][n+1];
        for (int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(q[i-1]==0){
                    //该件商品为主件 判断商品的的总价值是否小于允许购买的总价
                    if(p[i-1]<=j){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-p[i-1]]+v[i-1]);
                    }
                }else {
                    //该件商品为附件，此时需要主件与附件一起购买，需要找到和次主件相关联的附件
                    //q[i-1]表示该件商品的主键编号 数组小标与物品编号差1;
                    if(p[i-1]+p[q[i-1]]<j){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-p[i-1]]+v[i-1]);
                    }
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
