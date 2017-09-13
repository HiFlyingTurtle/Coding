package com.com.wwh.qiuzhao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
/**
 * 搜狗秋招在线编程
 * @author wwh
 * @create 2017-09-08 15:53
 **/
public class sougou02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.valueOf(br.readLine());

        String []data =new String[n+1];
        for(int i=0;i<n;i++){
            data[i]=br.readLine();
        }

//        double max=0.00000000;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                double differ=Math.abs(Double.parseDouble(data[j])-Double.parseDouble(data[i]));
//                if(differ>180.00000000)
//                    differ=360.00000000-differ;
//                if(differ>max)
//                    max=differ;
//            }
//        }

        double max=0.00000000;
        int j=0;
        double sub;
        for (int k=1;k<n;k++){
            sub=Math.abs(Double.parseDouble(data[k])-Double.parseDouble(data[j]));
            if(sub>180.00000000)
                sub=360.00000000-sub;

            if(sub>max)
                max=sub;
            else if(sub<0)
                j=k;
        }

        DecimalFormat df=new DecimalFormat("0.00000000");
        System.out.println(df.format(max));

    }
}
