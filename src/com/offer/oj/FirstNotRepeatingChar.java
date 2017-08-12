package com.offer.oj;
import java.util.HashMap;
/**
 * FirstNotRepeatingChar
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置
 * 思路：(1)统计出每个字符出现的次数，在找出第一个对应出现的字符
 * @author wwh
 * @create 2017-08-12 14:02
 **/
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0||str==null) return -1;
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character key=str.charAt(i);
            if(hm.containsKey(key)){
                int value=hm.get(key);
                hm.put(key, value+1);
            }else{
                hm.put(key, 1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(hm.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
