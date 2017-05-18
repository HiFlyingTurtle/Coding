package com.offer.oj;
import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 * @author wwh
 * @create 2017/5/18
 */
public class PrintMatrix {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
       if(matrix.length==0) return result;
        int row=matrix.length;
        int col=matrix[0].length;
        if(col==0) return result;
        int layer=(Math.min(row,col)-1)/2+1;
        for(int i=0;i<layer;i++){
            for(int k = i;k<col-i;k++) result.add(matrix[i][k]);//左至右
            for(int j=i+1;j<row-i;j++) result.add(matrix[j][col-i-1]);//右上至右下
            for(int k=col-i-2;(k>=i)&&(row-i-1!=i);k--) result.add(matrix[row-i-1][k]);//右至左
            for(int j=row-i-2;(j>i)&&(col-i-1!=i);j--) result.add(matrix[j][i]);//左下至左上
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
