package com.scut.chunzhao;
import java.util.Scanner;

/**
 * 携程在线笔试编程第三题
 *
 * @author wwh
 * @create 2017-04-11 20:44
 **/
public class Main1 {
/*请完成下面这个函数，实现题目要求的功能*/
/*当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
    /******************************开始写代码******************************/
    static int maxProfit(int[] stockPrices, int k) {
         int start=stockPrices[0];
         int profit=0;
         for(int i=1;i<stockPrices.length;i++){
             if(i+1==stockPrices.length&&stockPrices[stockPrices.length-1]>start){
                 profit+=stockPrices[stockPrices.length]-1-start;
             }
             if(stockPrices[i]>start&&stockPrices[i+1]<stockPrices[i]){
                 profit=stockPrices[i]-start;
                 if(i+k<stockPrices.length){
                     start=stockPrices[i+3];
                     i=i+3;
                 }
             }
         }

            return profit;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _stockPrices_size = 0;
        _stockPrices_size = Integer.parseInt(in.nextLine().trim());
        int[] _stockPrices = new int[_stockPrices_size];
        int _stockPrices_item;
        for(int _stockPrices_i = 0; _stockPrices_i < _stockPrices_size; _stockPrices_i++) {
            _stockPrices_item = Integer.parseInt(in.nextLine().trim());
            _stockPrices[_stockPrices_i] = _stockPrices_item;
        }

        int _k;
        _k = Integer.parseInt(in.nextLine().trim());

        res = maxProfit(_stockPrices, _k);
        System.out.println(String.valueOf(res));

    }
}

