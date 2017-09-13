package com.com.wwh.qiuzhao;
import java.util.HashMap;
import java.util.Scanner;
/**
 * 京东秋招笔试在线编程
 * @author wwh
 * @create 2017-09-08 18:55
 **/
public class JinDong02 {
    private  static HashMap<String,Integer> map=new HashMap<String,Integer>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String line=sc.next();
            System.out.println(solve(line));
        }
    }

    public static int solve(String line){
        if(line.length()==0)  return 1;
        int result=0;
        if(map.containsKey(line))
            return map.get(line);
        int left=1,right=0;
        for(int i=1;i<line.length();i++){
            char ch=line.charAt(i);
            if(ch=='(') left++;
            else{
                right++;
                if(left>=right){
                    String str=line.substring(1,i)+line.substring(i+1);
                    int temp=solve(str);
                    result+=temp;
                }
            }
        }
        map.put(line,result);
        return result;
    }
}