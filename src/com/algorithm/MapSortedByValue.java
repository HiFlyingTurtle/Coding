package com.algorithm;

import java.util.*;

/**
 * Created by WWH on 2017/4/5.
 * 使用Map来进行排序，使用value的值来进行排序实现比较
 */
public class MapSortedByValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("c", 1);
        map.put("b", 1);
        map.put("a", 3);
        map.put("d", 2);
        System.out.println(map);
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            //降序排序
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //return o1.getValue().compareTo(o2.getValue());
                //实现按照值的比较来进行排序或者按照键值
                return o2.getValue().compareTo(o1.getValue());
            }
        });
       /* ValueComparator vc=new ValueComparator(map);
        TreeMap<String,Integer> treeMap=new TreeMap<>(vc);
        treeMap.putAll(map);
        System.out.println(treeMap);*/
    }
}
//实现Comparator接口来实现对值的排序
class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    @Override
    public int compare(String o1, String o2) {
        //根据键值来获取值的大小的比较
        if (base.get(o1) >= base.get(o2)) {
            return -1;
        } else {
            return 1;
        }
    }
}
//实现的通用的一个比较器，实现按照值来进行排序比较
class MapUtil
{
    public static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue( Map<K, V> map )
    {
        List<Map.Entry<K, V>> list =
                new LinkedList<Map.Entry<K, V>>( map.entrySet() );
        Collections.sort( list, new Comparator<Map.Entry<K, V>>()
        {
            public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list)
        {
            result.put( entry.getKey(), entry.getValue() );
        }
        return result;
    }
}