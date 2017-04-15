package com.scut.test;

import java.util.Scanner;

/**
 * Created by WWH on 2017/4/6.
 * 2016京东实习生招聘笔试题
 */
public class XIAQI {
    public static int check(char[][] a) {
        int xflag = 0;
        int oflag = 0;
        // 横着
        for (int i = 0; i < 3; i++) {
            if (a[i][0] != '.' && a[i][0] == a[i][1] && a[i][0] == a[i][2]) {
                if (a[i][0] =='X')
                    xflag = 1;
                else
                    oflag = 1;
            }
        }
        // 竖着
        for (int i = 0; i < 3; i++) {
            if (a[0][i] != '.' && a[0][i] == a[1][i] && a[0][i] == a[2][i]) {
                if (a[0][i] == 'X')
                    xflag = 1;
                else
                    oflag = 1;
            }
        }
        // 右对角线
        if (a[0][0] != '.' && a[0][0] == a[1][1] && a[0][0] == a[2][2]) {
            if (a[0][0] =='X')
                xflag = 1;
            else
                oflag = 1;
        }
        // / 左对角线
        if (a[0][2] != '.' && a[0][2] == a[1][1] && a[0][0] == a[2][0]) {
            if (a[0][2] == 'X')
                xflag = 1;
            else
                oflag = 1;
        }

        if (xflag == 1 && oflag == 0) {
            return 1;
        } else if (xflag == 0 && oflag == 1) {
            return 2;
        } else if (xflag == 1 && oflag == 1){
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char [][]board=new char[3][3];
        for (int i=0;i<board.length;i++){
            String line=sc.next();
            for (int j=0;j<board[i].length;j++){
                board[i][j]=line.charAt(j);
            }
        }

        int xres=0;
        int ores=0;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                if(board[i][j]=='X') xres++;
                if(board[i][j]=='O') ores++;
            }
        }

        int winner=check(board);
        if(winner==1){
            if(xres-ores==1&&xres+ores<=9){
                System.out.println("1 won");
            }else {
                System.out.println("x");
            }
        }else if(winner==2) {
            if(xres-ores==1&&xres+ores<=9){
                System.out.println("2 won");
            }else {
                System.out.println("x");
            }
        }else if(winner==3){
            System.out.println("x");
        }else {
            if(ores+xres==9&&xres==5&&ores==4){
                System.out.println("draw");
            }else if(ores+xres<9&&xres-ores==1){
                System.out.println(1);
            }else if(ores+xres<9&&xres==ores){
                System.out.println(2);
            }else {
                System.out.println("x");
            }
        }

    }
}
