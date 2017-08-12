package com.offer.oj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * @author wwh
 * @create 2017-08-12 13:59
 **/
public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length==0||numbers==null) return "";
        StringBuilder sb=new StringBuilder();
        String [] numStr=new String[numbers.length];

        for(int i=0;i<numbers.length;i++){
            numStr[i]=String.valueOf(numbers[i]);
        }
        Arrays.sort(numStr,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1=o1+o2;
                String s2=o2+o1;
                return s1.compareTo(s2);
            }
        });
        for(int i=0;i<numStr.length;i++){
            sb.append(numStr[i]);
        }

        return sb.toString();
    }
}
