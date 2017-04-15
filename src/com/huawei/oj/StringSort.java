package com.huawei.oj;
import java.util.*;

/**
 * Created by WWH on 2017/3/10.
 * TreeSet对字符串进行排序的时候是按照UNICODE值来进行比较的
 *
 */
public class StringSort {
//     abstract    class MyCompare implements  Comparator<String> {
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> ts=new ArrayList<>();
        while(sc.hasNext()){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                String text=sc.next();
                ts.add(text);
            }
            Collections.sort(ts);
          /*  Collections.sort(ts, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return 0;
                }
            });*/
            for (String str:ts){
                System.out.println(str);
            }
        }
    }
}
