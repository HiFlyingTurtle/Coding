package com.scut.wwh;

/**
 * Created by WWH on 2017/3/19.
 */
public class NULL {
    public static void print(){
        System.out.println("MTDP");
    }
    public static void main(String[] args) {
        try{
            ((NULL)null).print();
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
