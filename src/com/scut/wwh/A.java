package com.scut.wwh;

/**
 * Created by WWH on 2017/9/13.
 */
public class A {
    static {
        System.out.println("A");
    }
    {
        System.out.println("D");
    }
    public A(){
        System.out.println("a");
    }


}

class  B extends A{
    static {
        System.out.println("B");
    }
    {
        System.out.println("C");
    }
    public B(){
        System.out.println("b");
    }
    public static void main(String[] args) {
       B b= new B();

    }
}


