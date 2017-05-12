package com.scut.test;
import java.util.Scanner;
/**
 * 微众在线笔试编程题03
 * @author wwh
 * @create 2017-04-25 20:39
 **/
public class WeiZhong03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []x=new int[n];
            int []m=new int[n];

            for (int i=0;i<n;i++){
               x[i]=sc.nextInt();
                m[i]=sc.nextInt();
            }

            int truck=0;

            for(int i=0;i<n;i++){
               truck+=x[i];
                for(int j=0;j<m[i]-1;j++){
                    truck=truck+x[i]+j+1;
                }
            }

            if(truck%2==1){
                System.out.println("first");
            }else {
                System.out.println("second");
            }

        }

    }
}
