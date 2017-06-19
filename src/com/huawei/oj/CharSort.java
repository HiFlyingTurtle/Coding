package com.huawei.oj;
import java.util.Scanner;
/**
 * 华为机试在线编程字符串排序
 * @author wwh
 * @create 2017-06-19 21:44
 **/
public class CharSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String line=sc.nextLine();
            char [] ch=line.toCharArray();
            StringBuffer result=new StringBuffer();
            for (int i=0;i<26;i++){
                char c=(char)(i+'A');
                for (int j=0;j<ch.length;j++){
                    if(ch[j]==c||ch[j]==(char)(c+32))
                        result.append(ch[j]);
                }
            }

            for (int k=0;k<ch.length;k++){
                if(!(ch[k]>='A'&&ch[k]<='Z'||ch[k]>='a'&&ch[k]<'z'))
                    result.insert(k,ch[k]);
            }

            System.out.println(result);
        }
    }

}
