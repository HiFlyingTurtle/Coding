package com.offer.oj;
import java.util.Map.Entry;
import java.util.HashMap;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * @author wwh
 * @create 2017-08-12 13:50
 **/
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int num=0;
        if(array.length==0||array==null)
            return num;
        for(int i=0;i<array.length;i++){
            int key=array[i];
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }

        int count=array.length/2;
        for(Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>count){
                num=entry.getKey();
            }
        }

        return num;
    }
}
