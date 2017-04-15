package com.offer.oj;

/**
 * Created by WWH on 2017/4/2.
 * 1.查找数组中只出现一次的数据，其他的数据都出现了两次
 * 2.一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 关于异或，两次数字的值相同异或为0，不相同异或为1
 */
public class YiHUO {
    public void FindNumsApperOnce(int []array,int []num1,int []num2){
        if(array==null||num1==null||num2==null){
            return;
        }
        int res=0;
        for (int num:array){
            res^=num;
        }
        num1[0] = 0;
        num2[0] = 0;
        res = getDiffierentSymbol(res);
        for(int num:array){
            if ((num&res)!=0){
                num1[0]^=num;
            }else{
                num2[0]^=num;
            }
        }

    }

    private int getDiffierentSymbol(int num){
        int res = 1;
        while ((res&num)==0) {
            res <<= 1;
        }
        return res;
    }

    public  static int findUniqueNumber(int []a){
        int res=a[0];
        for (int i=1;i<a.length;i++){
            res^=a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={3,2,2,4,4,5,5};
        System.out.println(findUniqueNumber(a));
        int c=3;
        int b=4;
        System.out.println(c^b);
    }
}
