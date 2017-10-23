package com.com.wwh.qiuzhao;
import java.util.*;

/**
 * 二叉树遍历
 * @author wwh
 * @create 2017-09-16 20:11
 **/
public class BTreeTranverse {

    static TreeSet<String> fullPermutation(char[] A, int p, int r) {
        if (r - p <= 1) {
            char[] cs = new char[2];
            cs[0] = A[p];
            cs[1] = A[r];
            TreeSet<String> set = new TreeSet<String>();
            set.add(new String(cs));
            cs[0] = A[r];
            cs[1] = A[p];
            set.add(new String(cs));
            return set;
        }
        return insertChar(A[p], fullPermutation(A, p + 1, r));
    }


    private static TreeSet insertChar(char c, Set<String> setIn) {
        TreeSet set = new TreeSet<String>();
        for (String s : setIn) {
            char[] cs = s.toCharArray();
            int len = cs.length + 1;
            char[] result = new char[len];
            for (int i = 0; i < len; i++) {
                result[i] = c;
                for (int j = 0, k = 0; k < len - 1; j++, k++) {
                    if (j == i)
                        j++;
                    result[j] = cs[k];
                }
                set.add(new String(result));
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            String inOrder=sc.next();
            char [] charArray=inOrder.toCharArray();
            char [] array=Arrays.copyOfRange(charArray, 1, charArray.length);
            Set<String> set=fullPermutation(array, 0, array.length-1);
            for(String s:set){
                System.out.println(s+charArray[0]);
            }
        }
    }
}
