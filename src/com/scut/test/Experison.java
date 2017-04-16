package com.scut.test;

import java.util.Scanner;
import java.util.Stack;

/**
 * 后缀表达
 * @author wwh
 * @create 2017-03-17 19:39
 **/
public class Experison {

    public static int cal(int b, int a, char ch) {
        int sum = 0;
        if (ch =='+') {
            sum = a + b;
        } else if (ch =='-') {
            sum = a - b;
        } else if (ch =='*') {
            sum = a * b;
        }

        return sum;

    }

    public static  int postfixCalc(String text){
        Stack<Integer> number = new Stack<>();
        int temp = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= '0' && ch <= '9') {
                temp = ch - '0';
                number.push(temp);
            } else if (ch >= 'A' && ch <= 'F') {
                temp = ch - 'A' + 10;
                number.push(temp);
            } else {
                int t = cal(number.pop(), number.pop(), ch);
                number.push(t);
            }

        }
        return number.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String text = sc.nextLine();
            System.out.println(postfixCalc(text));
        }
          sc.close();
    }
}