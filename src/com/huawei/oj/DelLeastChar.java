package com.huawei.oj;
import java.util.*;
/**
 * 华为在线编程删除字符串中出现的最小字符串
 * 实现对map的排序
 * @author wwh
 * @create 2017-04-08 15:53
 **/
public class DelLeastChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String line=sc.nextLine();
            HashMap<Character,Integer> map=new HashMap();
            for(int i=0;i<line.length();i++){
                if(map.containsKey(line.charAt(i))){
                    map.put(line.charAt(i),map.get(line.charAt(i))+1);
                }else {
                    map.put(line.charAt(i),1);
                }
            }
            List<Map.Entry<Character,Integer>> clist=new ArrayList<>(map.entrySet());
            Collections.sort(clist, new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                    return o1.getValue()-o2.getValue();
                }
            });

            line=line.replace(clist.get(0).getKey().toString(),"");

            for(int i=1;i<clist.size();i++){
                if(clist.get(i).getValue()==clist.get(0).getValue()){
                    String  c=clist.get(i).getKey().toString();
                    line=line.replace(c,"");
                }
            }

            System.out.println(line);

           /* for (Map.Entry<Character,Integer> smap:clist){
                System.out.println(smap.getKey()+" "+smap.getValue());
            }*/

        }
    }
}
