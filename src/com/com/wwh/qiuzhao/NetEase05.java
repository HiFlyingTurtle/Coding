package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 网易秋招在线编程
 * @author wwh
 * @create 2017-09-09 14:47
 **/
public class NetEase05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int [] parent=new int[n];
            for(int i=0;i<n-1;i++){
                parent[i]=sc.nextInt();
            }
            int cnt=0, pos=0;
            int i=0;

            for(i=0;i<n-1;i++)
            {
                if(parent[i]==0)
                {
                    cnt++;
                    pos=i+1;
                    break;
                }
            }

            while(true)
            {
                for(i=0;i<n-1;++i)
                {
                    if(parent[i]==pos)
                    {
                        cnt++;
                        pos=i+1;
                        break;
                    }
                }
                if(i==n-2)
                    break;
            }

            System.out.println(cnt);
        }
    }
}
