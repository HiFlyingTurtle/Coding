package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 中国电信在线笔试编程题
 * @author wwh
 * @create 2017-09-24 17:55
 **/
public class ZhongGuoDianXin01 {
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
