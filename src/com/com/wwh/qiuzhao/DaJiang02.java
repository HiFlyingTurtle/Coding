package com.com.wwh.qiuzhao;
import java.util.Scanner;
/**
 * 大疆在线编程02
 * @author wwh
 * @create 2017-09-13 22:06
 **/
public class DaJiang02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            while (n-->0){
                int x;
                String  y;
                int [] card=new int[15];
                for (int i=0;i<20;i++){
                    int temp=sc.nextInt();
                    y=sc.next();
                    card[temp]++;
                }
                int one = 0, two = 0, three = 0, four = 0, five = 0;
                int startpos, cnt;
                for (int i = 1; i < card.length; ++i) {
                    if (card[i] == 0)
                        continue;
                    if (card[i] == 4)
                        four++;
                    else if (card[i] == 3)
                        three++;
                    else if (card[i] == 2)
                        two++;
                    else if (card[i] == card[i + 1]) {
                        startpos = i;
                        cnt = 0;
                        while (card[i] == card[i + 1] && card[i] == 1) {
                            i++;
                            if (i == card.length - 1) break;
                        }
                        if (i != card.length - 1)
                            cnt = i - startpos;
                        else
                            cnt = i - startpos + 1;
                        if (cnt >= 5)
                            five++;
                        else
                            one += cnt;
                    }
                }
                int res = 0;
                res = four + five + Math.max(three, one);
                System.out.println(res);
            }
        }
    }
}
