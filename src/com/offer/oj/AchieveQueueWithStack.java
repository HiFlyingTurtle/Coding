package com.offer.oj;

import java.util.Stack;

/**
 * 用两个栈实现队列
 *
 * @author wwh
 * @create 2017-03-22 21:27
 **/
public class AchieveQueueWithStack {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                int temp=stack1.pop();
                stack2.push(temp);
            }

        }
        return stack2.pop();
    }
    public static void main(String[] args) {

    }
}
