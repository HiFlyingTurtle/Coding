package com.algorithm;

import java.util.*;

/**
 * Created by WWH on 2017/4/2.
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        Iterator<String> it=collection.iterator();
        ArrayList<Integer> li=new ArrayList<>();
        li.listIterator();
        Collections.sort(li,Collections.reverseOrder());
        List<String> list=Arrays.asList("yellow","red","green","blue");
        list.listIterator();
       /* Collections.sort(list);*/
        Collections.reverse(list);//将当前的集合的元素逆序输出，并没有进行排序
        System.out.println(list);
       /* Queue<Integer> queue=new Queue<Integer>() {
        };*/
    }
}
