package com.huawei.oj;
import java.util.*;

/**
 * 查找字典中指定的单词的数量 并按照指定顺序输出
 * @author wwh
 * @create 2017-06-19 21:58
 **/
public class WordDict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            String[] dict = new String[num];
            for (int i = 0; i < num; i++) {
                dict[i] = sc.next();
            }


            String query = sc.next();
            int seq = sc.nextInt();

            List<String> result = new ArrayList<>();
            for (int j = 0; j < dict.length; j++) {
//                System.out.println(dict[j]+"--"+query);
                if (IsBrotherWord(dict[j], query)) {
                    result.add(dict[j]);
                }
            }
                System.out.println(result.size());
                Collections.sort(result);

                if (result.size() >= seq) {
                    System.out.println(result.get(seq - 1));
                }

        }
        sc.close();
    }


   public static boolean IsBrotherWord(String key,String query){
        if(key.length()!=query.length()|| key.equals(query))
            return false;
        char [] keyChar=key.toCharArray();
        char [] queryChar=query.toCharArray();

        Arrays.sort(keyChar);
        Arrays.sort(queryChar);

//       System.out.println(String.valueOf(keyChar)+"-->"+String.valueOf(queryChar));
        if(Arrays.equals(keyChar,queryChar))
            return true;
        else
            return false;

    }
}
