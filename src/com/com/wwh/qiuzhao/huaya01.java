package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 虎牙在线编程
 * @author wwh
 * @create 2017-09-18 20:41
 **/
public class huaya01 {
    public static  final String [] dict={"中国","直播","游戏","游戏直播","综艺娱乐","互动直播平台"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String  line=sc.nextLine();
            int m=dict.length;
            int length=line.length();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<length-m;i=i+m){
                String temp=line.substring(i,i+m);
                for(int j=0;j<m;j++){
                    if(temp.contains(dict[j])){
                        sb.append(dict[j]+",");
                    }
                }
            }

            if(length%m>0){
                String left=line.substring(length-length%m);
                for(int j=0;j<m;j++){
                  if(dict[j].equals(left)){
                      sb.append(left + ",");
                  }
                }
            }
            System.out.println(sb.toString().substring(0,sb.toString().lastIndexOf(',')));
        }
    }
}
