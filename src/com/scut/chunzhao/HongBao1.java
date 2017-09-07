package com.scut.chunzhao;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 人人网机试题
 * @author wwh
 * @create 2017-03-19 22:23
 **/
public class HongBao1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            String name=sc.next();
            map.put(name,0);
        }

        for(int i=0;i<n;i++){
            String sname=sc.next();
            int mi=sc.nextInt();
            int ki=sc.nextInt();

            int avgMoney=0;

            if(ki!=0){
                int temp=mi%ki;
                avgMoney=(mi-temp)/ki;
                map.put(sname,temp+map.get(sname)-mi);
            }
            for (int j=0;j<ki;j++){
                String rname=sc.next();
                map.put(rname,map.get(rname)+avgMoney);
            }
        }

        for (String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
