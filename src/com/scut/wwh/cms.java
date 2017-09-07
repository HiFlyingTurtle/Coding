package com.scut.wwh;
/**
 * Created by wwh on 2017/5/13.
 */
public class cms {
    public int getDistance(int dis){
        float res=dis;
        float s=dis;
        while (s>0.01){
            s=s/2;
            res+=2*s;
        }
        return (int)(res+0.5);
    }
    public  int calcDistance(int A, int B, int C, int D) {
        int sum=0;
        sum=getDistance(A)+getDistance(B)+getDistance(C)+getDistance(D);
        return sum;
    }
    public static void main(String[] args) {
        cms sm=new cms();
        System.out.println( sm.calcDistance(100,90,80,70));
    }
}
