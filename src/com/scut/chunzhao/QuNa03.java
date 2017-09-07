package com.scut.chunzhao;
import java.util.*;

/**
 * 去哪网在线编程03
 * @author wwh
 * @create 2017-04-01 19:45
 **/
public class QuNa03 {
    public static int getDistanceFromStartToEnd(String start,String end,Set<String> set){
        int distance=2;
        Queue<String> queue=new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i=0;i<size;i++){
                String headWord=queue.poll();
                for (int j=0;j<start.length();j++){
                    for (char ch='a';ch<='z';ch++){
                        StringBuffer sb=new StringBuffer(headWord);
                        sb.setCharAt(j,ch);
                        if(end.equals(sb.toString())){
                           return distance;
                        }else if(set.contains(sb.toString())) {
                            set.remove(sb.toString());
                            queue.add(sb.toString());
                        }
                    }
                }
            }
            distance++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String start=sc.nextLine();
        String end=sc.nextLine();
        String list=sc.nextLine();
        String [] strArray=list.split("\\s+");
        Set<String> set=new HashSet<>();
        for (String s:strArray){
            set.add(s);
        }

        System.out.println(getDistanceFromStartToEnd(start,end,set));

    }
}
