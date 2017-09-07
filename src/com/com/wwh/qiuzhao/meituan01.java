package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 美团秋招内推在线编程01
 * @author wwh
 * @create 2017-08-31 18:45
 **/
public class meituan01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int [] array=new int[num];
            for(int i=0;i<num;i++){
                array[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            int maxlength=0;

            for(int start=0;start<array.length;start++){
                int thisSum=0;
                int thisLength=0;
                for(int end=start;end<array.length;end++){
                    thisLength=end-start+1;
                    /**
                     * 少了个break ，通过率只有83%
                     */
                    if(maxlength>thisLength) break;
                    thisSum+=array[end];
                    if(thisSum%k==0){
                        if(thisLength>maxlength){
                            maxlength=thisLength;
                        }
                    }
                }
            }

            System.out.println(maxlength);
        }

    }
}
