package com.scut.test;
import java.util.Scanner;

/**
 * 携程在线笔试编程题02
 *
 * @author wwh
 * @create 2017-04-11 18:50
 **/
public class XIECHENG02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]board=new int[3][3];
        int []array=new int[9];
        int count=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                int temp=sc.nextInt();
                board[i][j]=temp;
                array[count++]=temp;
            }
        }
       /* for (int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }
        System.out.println();*/

        int res=0;
        for (int i=0;i<array.length;i++){
            int k=array[i];
            int t=i;

            while(t>0){
                if(array[t-1]>k) res++;
                t=t-1;
            }
        }

        System.out.println(res);





    }
}
