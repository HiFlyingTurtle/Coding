package com.scut.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 今日头条在线编程03
 * @author wwh
 * @create 2017-03-30 20:12
 **/
public class TouTiao03 {
    public  static String queryForString(List<String> data,String query){
        query=query.toLowerCase();
        String [] strArray=query.split("\\s+");
        int []ans=new int[data.size()];
        for (int i=0;i<data.size();i++){
            ans[i]=0;
        }

        for(int i=0;i<data.size();i++){
            String temp=data.get(i).toLowerCase();
          for(String s:strArray){
              if(temp.contains(s)){
                  ans[i]=ans[i]+1;
              }
          }
        }

        int max=ans[0];
        int index=0;
        for(int i=1;i<ans.length;i++){
            if(ans[i]>max) {
                max=ans[i];
                index=i;
            }
        }


        return data.get(index);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            String line=sc.nextLine();

            List<String> data = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                data.add(sc.nextLine());
            }


            List<String> query = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                query.add(sc.nextLine());
            }

            for (int i = 0; i < m-1; i++) {
                System.out.println(queryForString(data, query.get(i)));
            }

          System.out.print(queryForString(data, query.get(m - 1)));
    }
}
