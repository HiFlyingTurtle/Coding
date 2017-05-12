package com.scut.test;

import java.util.*;

/**
 * 阿里在线编程02
 *
 * @author wwh
 * @create 2017-04-26 20:38
 **/
public class Ali02 {
    public static void main(String[] args) {
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }

    }

    // write your code here
    public static int resolve(String expr) {
        List<String> list= Arrays.asList("^","+","*");
        Stack<Integer> stack=new Stack<>();
        String [] strArray=expr.split("\\s+");
        for (String str:strArray){
            if(!list.contains(str)){
                if(stack.size()>16)
                    return -2;
                else {
                    stack.push(Integer.valueOf(str));
                }
            }else {
                if(str.equals("^")){
                    if(stack.size()<1) return -1;
                    else {
                        Integer temp=stack.pop();
                        stack.push(temp+1);
                    }
                }

                if(str.equals("+")){
                    if(stack.size()<2) return -1;
                    else {
                        Integer p1=stack.pop();
                        Integer p2=stack.pop();
                        stack.push(p1+p2);
                    }
                }

                if(str.equals("*")){
                    if(stack.size()<2) return -1;
                    else {
                        Integer p1=stack.pop();
                        Integer p2=stack.pop();
                        stack.push(p1*p2);
                    }
                }
            }
        }
     return stack.peek();
    }
}
