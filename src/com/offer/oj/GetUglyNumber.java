package com.offer.oj;
import java.util.ArrayList;
/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * @author wwh
 * @create 2017-08-12 14:00
 **/
public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        ArrayList<Integer> res=new ArrayList<>();
        res.add(1);
        int num2=0,num3=0,num5=0;

        while(res.size()<index){
            int m2=res.get(num2)*2;
            int m3=res.get(num3)*3;
            int m5=res.get(num5)*5;
            int min=Math.min(m2, Math.min(m3, m5));
            res.add(min);
            if(min==m2) num2++;
            if(min==m3) num3++;
            if(min==m5) num5++;
        }
        return res.get(index-1);
    }
}
