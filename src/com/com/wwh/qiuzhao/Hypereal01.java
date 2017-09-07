package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * hypereal在线技术笔试第一场
 * @author wwh
 * @create 2017-09-07 14:22
 *
 **/
public class Hypereal01 {

    int Rand5(){
     int x=6;
        do{
//            x=rand3()*2+rand3();
        }while(x>=4);
            return x;

    }

     /**
     * 编写一个算法，若M*N矩阵中某个元素为0，则将其所在的行与列清零
      * 这里用两个数组分别记录包含零元素的所在行和列，然后，在第二遍遍历矩阵时，
      * 若所在行或所在列标记为0，则将元素清为0
     * @param matrix
     */
     public void ConvertToZeros(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];


        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(row[i]|| column[j]){
                    matrix[i][j] =0;
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}

class Singleton{
    private volatile static Singleton singleton = null;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();

                }
                //return singleton;
            }
        }
        return singleton;
    }
}

