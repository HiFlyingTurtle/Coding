package com.scut.test;
import java.util.Scanner;
/**
 * 阿里巴巴在线编程01题
 * @author wwh
 * @create 2017-04-26 19:54
 **/
public class Ali01 {
    public static boolean filter(char[] str,char[] pattern){
        if(str==null||pattern==null) return false;
        return filterCore(str,0,pattern,0);
    }

    public static boolean filterCore(char[] str,int s,char [] pattern,int p){
        if(str.length<=s&&pattern.length<=p)
            return true;
        if(str.length>s&&pattern.length<=p)
            return false;

        if(p+1<pattern.length&&pattern[p+1]=='*'){
            if(s>=str.length) return filterCore(str,s,pattern,p+2);
            else {
                if (pattern[p]==str[s]||pattern[p]=='?'){
                    return  filterCore(str,s+1,pattern,p+2)
                            ||filterCore(str,s+1,pattern,p)
                            ||filterCore(str,s,pattern,p+2);
                }else {
                    return filterCore(str,s,pattern,p+2);
                }
            }
        }

        if(s>=str.length) return  false;
        else {
            if(str[s]==pattern[p]||pattern[p]=='?'){
                return filterCore(str,s+1,pattern,p+1);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String pattern=sc.nextLine();
        System.out.println(str);
        System.out.println(pattern);
        boolean flag=filter(str.toCharArray(), pattern.toCharArray());
        if(flag){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

}
