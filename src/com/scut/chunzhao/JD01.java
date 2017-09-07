package com.scut.chunzhao;
import java.util.Scanner;

/**
 * 京东在线笔试编程题01
 * @author wwh
 * @create 2017-04-07 18:38
 **/
public class JD01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String line=sc.next();
        int res=0;
        boolean [] flag=new boolean[n];
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)>='0'&&line.charAt(i)<='9'){
                int lfield=line.charAt(i)-'0';
                int rfield=line.charAt(i)-'0';
                int left=i-1;
                int right=i+1;

                //左
                while(lfield>0){
                    if(left>=0){
                        if(line.charAt(left)=='X'){
                            flag[left]=true;
                        }
                        left=left-1;
                    }
                  lfield--;
                }

                //右
                while(rfield>0){
                    if(right<line.length()){
                        if(line.charAt(right)=='X'){
                            flag[right]=true;
                        }
                        right=right+1;
                    }
                  rfield--;
                }

            }
        }

        for (int i=0;i<flag.length;i++){
            if(flag[i]) res++;
        }

        System.out.println(res);

    }


}
