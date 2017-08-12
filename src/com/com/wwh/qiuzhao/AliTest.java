package com.com.wwh.qiuzhao;
import java.util.*;

/**
 * 阿里在线 编程
 *
 * @author wwh
 * @create 2017-08-03 21:03
 **/
public class AliTest {

    static int cut(int[] parts) {
        PriorityQueue<Integer> que=new PriorityQueue<>(parts.length);

        for(int i=0;i<parts.length;i++){
            que.add(parts[i]);
        }
        int sum=0;
        while (!que.isEmpty()) {
            if (1 == que.size()) { break; }  // 只剩根节点

            int first = que.poll(); //弹出前两个结点
            int second = que.poll();

            int temp = first + second; //合并
            sum += temp; //中间结点权值累加
            que.add(temp);
        }
        return sum;
    }

    //默认实现最小堆

    public static void main(String[] args) {
        int [] parts={7,9,8,6,5};
//        System.out.println(cut(parts));

        PriorityQueue<Integer> que=new PriorityQueue<>(parts.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1-o2);
            }
        });

        for(int i=0;i<parts.length;i++){
            que.add(parts[i]);
        }
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que);

    }

}
