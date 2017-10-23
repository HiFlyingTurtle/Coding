package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 中国电信在线笔试编程题
 * @author wwh
 * @create 2017-09-24 17:56
 **/
public class ZhongGuoDianXin02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String line=sc.nextLine();
            line=line+"c";
            int [] num=new int[255];
            char [] charArray=line.toCharArray();
            int [] res=new int[255];
            int flag=0;
            int count=0;
            int t=0;

            for(int i=0;i<charArray.length;i++){
                if(charArray[i]>='0'&&charArray[i]<='9'){
                    flag=1;
                    num[t++]=line.charAt(i)-'0';
                }else if(flag==1) {
                    res[count]=0;
                    for (int j=0;j<t;j++){
                        res[count]=res[count]+num[j]*(int)Math.pow(10,t-j-1);
                    }
                    System.out.print(res[count] + " ");
                    count++;
                    flag=0;
                    t=0;
                }
            }

            System.out.println();
            for(int i=0;i<count-1;i++){
                System.out.print(res[i] + " ");
            }

            System.out.print(res[count-1]);

        }
    }
}
