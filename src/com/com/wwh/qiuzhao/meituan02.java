package com.com.wwh.qiuzhao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * 美团秋招内推在线编程
 * 分组的所有人数之和减去最最大组的人数，大于最大组人数即可
 * @author wwh
 * @create 2017-08-31 18:46
 **/
public class meituan02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(list.get(0));
        boolean result = true;

        for (int i = 1; i < n; i++) {
            if (!queue.isEmpty()) {
                int num = queue.poll() - list.get(i);
                while (num < 0 && !queue.isEmpty()) {
                    num += queue.poll();
                }
                if (num < 0) {
                    result = false;
                } else if (num > 0) {
                    queue.addFirst(num);
                }
                queue.offer(list.get(i));
            }
        }

        if (queue.size() == n) {
            result = false;
        }
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
