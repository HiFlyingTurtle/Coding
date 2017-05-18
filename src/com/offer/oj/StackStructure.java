package com.offer.oj;
import java.util.Iterator;
import java.util.Stack;
/**
 * 定义栈的数据结构，实现min函数
 * @author wwh
 * @create 2017/5/18
 */
public class StackStructure {
    Stack<Integer> stack=new Stack<>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
      return stack.peek();
    }

    public int min() {
        int min = stack.peek();
        int tmp = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            tmp = iterator.next();
            if (min>tmp){
                min = tmp;
            }
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
