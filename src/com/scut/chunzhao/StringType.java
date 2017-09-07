package com.scut.chunzhao;

import java.util.*;

/**
 * 牛客网在线笔试第二题字符串分类
 * @author wwh
 * @create 2017-03-23 19:49
 * 对于确定了输入行的，使用next()函数来进行字符串的输入 不要选择nextLine会出现错误
 * 如果不确定输入行数 ，使用hasNetx()判断是否还有下一行
 **/
public class StringType {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        Set<String> se=new HashSet<>();
        for (int i=0;i<line;i++){
            String text=sc.next();
            char [] s=text.toCharArray();
            Arrays.sort(s);
            String str=new String(s);
         //   System.out.println(str);
            se.add(str);
           }
        System.out.println(se.size());
        sc.close();
    }
}
