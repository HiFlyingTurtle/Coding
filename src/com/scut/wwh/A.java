package com.scut.wwh;

/**
 * Created by WWH on 2017/9/13.
 */
public class A {
    static {
        System.out.println("A");
    }
    public A(){
        System.out.println("a");
    }
}

class  B extends A{
    static {
        System.out.println("B");
    }
    public B(){
        System.out.println("b");
    }
}


