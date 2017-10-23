package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 去哪在线编程02
 * @author wwh
 * @create 2017-10-11 9:41
 **/
public class QuNa02 {
    public static int max=0;
    public static int [] array=new int[100];
    public static int count=0;

    public static void searchPath(String [][] path,int m,String src,String des ){
        for(int i=0;i<m;i++){
            if(path[i][0].equals(src)){
                max++;
                if(path[i][1].equals(des)){
                    array[count++]=max;
                    max=0;
                    return ;
                }
                searchPath(path,m,path[i][1],des);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String src=sc.next();
            String des=sc.next();
            String [][] path=new String[m][2];
            for(int i=0;i<m;i++){
                path[i][0]=sc.next();
                path[i][1]=sc.next();
            }
            searchPath(path,m,src,des);
            int min=array[0];
            for(int i=0;i<count;i++){
                if(min>array[i]){
                    min=array[i];
                }
            }
            if(min==0){
                System.out.println("DISCONNECTED");
            }else {
                System.out.println(min-1);
            }

        }
    }
}
