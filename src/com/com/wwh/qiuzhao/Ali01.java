package com.com.wwh.qiuzhao;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 阿里巴巴秋季招聘在线编程第一题
 * @author wwh
 * @create 2017-08-25 18:43
 **/
public class Ali01 {
    private static final int  boxTemplate_price=2000;

    private static int process(item [] items)
    {
        String [] s={"a","b"};
        int boxNum=0;
        Arrays.sort(items, new Comparator<item>() {
            @Override
            public int compare(item i1, item i2) {
                return -(i1.itemPrice-i2.itemPrice);
            }
        });
        int price=0;
        int length=0;
        int width=0;
        int high=0;
        for(int i=0;i<items.length;i++){
            if(items[i].itemPrice>boxTemplate_price){
                boxNum++;
                continue;
            } else{
                price+=items[i].itemPrice;
//                length+=items[i].itemLong;
//                width+=items[i].itemWith;
//                high+=items[i].itemHigh;
            }
        }
        boxNum+=price/boxTemplate_price;
        if(price%boxTemplate_price>0) boxNum++;
        return boxNum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int boxTemplate_length = scanner.nextInt();
            int boxTemplate_width = scanner.nextInt();
            int boxTemplate_height = scanner.nextInt();

            int itemNum=scanner.nextInt();
            item []items=new item[itemNum];

            for(int i=0;i<itemNum;i++){
                int price=scanner.nextInt();
                int lon=scanner.nextInt();
                int with=scanner.nextInt();
                int high=scanner.nextInt();
                item ite=new item(price,lon,with,high);
                items[i]=ite;
            }

            System.out.println (process(items));
        }

    }

    static class item{
        int itemPrice;
        int itemLong;
        int itemWith;
        int itemHigh;

        item(int itemPrice,int itemLong ,int itemWith,int itemHigh ){
            this.itemPrice=itemPrice;
            this.itemLong=itemLong;
            this.itemWith=itemWith;
            this.itemHigh=itemHigh;
        }
    }

}