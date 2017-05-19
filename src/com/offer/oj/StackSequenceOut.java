package com.offer.oj;

import java.util.Stack;

/**
 * 输出所有入栈序列的出栈顺序
 * @author wwh
 * @create 2017/5/19
 */
public class StackSequenceOut {
    public static int number=0;
    static Stack<Integer> stack=new Stack<Integer>();//保存入栈的元素
    static int[] array=new int[10];//保存输出的元素

    //入栈顺序1到n,输出所有的出栈序列
    public static void print_valid_sequence(int i, int n )
    {


        int top;//用来取top
        if(i == n+1)//递归结束条件，输出序列
        {
            ++number;
            System.out.println(number+"——————");
            //输出数组中的元素
            for(int j = 0;j < n-stack.size();++j)
                System.out.print(array[j]+"-");//正序输出
            //输出栈中剩下的元素
            for(int k=stack.size()-1;k>=0;k--)
            {
                System.out.print(stack.get(k));
            }
            System.out.println();
        }
        else
        {
            stack.push(i);//入栈
            print_valid_sequence(i+1,n);
            stack.pop();//为保持stack不变，出栈

            if(!stack.empty())//将栈顶元素输出
            {
                top=stack.peek();
                array[i-stack.size()-1] = top;//将输出的元素放入array中
                stack.pop();
                print_valid_sequence(i,n);//i不变
                stack.push(top);
            }
        }
    }

    public static void main(String[] args) {
        print_valid_sequence(1,4);
    }
}
