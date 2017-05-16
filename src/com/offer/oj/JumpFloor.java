package com.offer.oj;

/**
 * 剑指offer跳台阶问题
 * @author wwh
 * @create 2017/5/14
 */
public class JumpFloor {
     /**
     * 跳上1级台阶，也可以跳上2级
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        int []result=new int[target+2];
        result[0]=0;
        result[1]=1;
        result[2]=2;
        if(target<=2) return result[target];
        else {
            for (int i = 3; i <= target; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
            return result[target];
        }

    }

     /**
     * 跳上1级台阶，也可以跳上2级……它也可以跳上n级
     * @param target
     * @return
     */
    public int JumpFloorII(int target){
        int []result=new int[target+2];
        result[0]=1;
        result[1]=1;
        result[2]=2;
        if(target<=2) return result[target];
        else {
            for(int i=3;i<=target;i++){
                for (int j=0;j<i;j++){
                    result[i]+=result[j];
                }
            }
        }
        return result[target];
    }
    public static void main(String[] args) {

    }
}
