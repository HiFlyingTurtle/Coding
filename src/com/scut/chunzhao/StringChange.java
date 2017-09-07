package com.scut.chunzhao;

import java.util.Scanner;

/**
 * chunzhao
 * @author wwh
 * @create 2017-03-17 19:02
 **/
public class StringChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String text=sc.nextLine();
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<text.length();i++){
                char c=text.charAt(i);
                if(c>='a'&&c<='z'){
                    sb.append(c);
                }else if(c>='A'&&c<='Z'){
                    sb.append(Character.toLowerCase(c));
                }
            }
            System.out.println(sb.toString());
        }
    }

}
