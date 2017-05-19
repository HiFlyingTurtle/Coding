package com.offer.oj;
import java.util.Stack;

/**
 * 栈的压入和弹出序列
 * @author wwh
 * @create 2017/5/19
 */
public class StackSequence {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stack=new Stack<>();
        for (int i=0,j=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (!stack.empty()&&stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
      return stack.size()==0;
    }
    public static void main(String[] args) {
       int [] pushA={1,2,3,4,5};
        int [] popA={4,5,3,2,1};
        System.out.println(IsPopOrder(pushA,popA));
    }

}
