package com.huawei.oj;

import java.util.Scanner;
/**
 * Created by WWH on 2017/4/5.
 * 坐标系
 * 当输入行提示只有一行字符串的时候
 * 还是尽量使用 sc.hasNext 来进行判断输入是否结束或者还有下一行
 */
public class Coordinate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] strArray = line.split(";");
            int x = 0;
            int y = 0;
            for (int i = 0; i < strArray.length; i++) {
                if ((strArray[i].length() > 0 && strArray[i].length() <= 3)) {
                    int len = strArray[i].length();
                    char ch = strArray[i].charAt(len - 1);
                    if (strArray[i].charAt(0) == 'A' && (ch >= '0' && ch <= '9')) {
                        x -= Integer.parseInt(strArray[i].substring(1));
                    }
                    if (strArray[i].charAt(0) == 'D' && (ch >= '0' && ch <= '9')) {
                        x += Integer.parseInt(strArray[i].substring(1));
                    }
                    if (strArray[i].charAt(0) == 'W' && (ch >= '0' && ch <= '9')) {
                        y += Integer.parseInt(strArray[i].substring(1));
                    }
                    if (strArray[i].charAt(0) == 'S' && (ch >= '0' && ch <= '9')) {
                        y -= Integer.parseInt(strArray[i].substring(1));
                    }

                }
            }
            System.out.println(x + "," + y);
        }
        sc.close();
    }
}
