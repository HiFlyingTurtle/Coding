package com.scut.chunzhao;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 微众银行在线笔试编程题02
 * @author wwh
 * @create 2017-04-25 19:57
 **/
public class WeiZhong02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            Set<String> set=new HashSet<>();
            int [] vectorX=new int[4];
            int [] vectorY=new int[4];

            for (int i=0;i<4;i++){
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                int x2=sc.nextInt();
                int y2=sc.nextInt();

                set.add(x1+"-"+y1);
                set.add(x2+"-"+y2);

                vectorX[i]=x2-x1;
                vectorY[i]=y2-y1;
            }

            if(set.size()!=4){
                System.out.println("NO");
                continue;
            }
            boolean flag=true;

            for(int i=0;i<4;i++){
                if(vectorX[i]*vectorY[i]!=0) {
                    flag=false;
                    break;
                }
            }

            for (int i=1;i<4;i++){
                if(!(vectorX[0]*vectorX[i]+vectorY[0]*vectorY[i]==0||vectorX[0]*vectorY[i]-vectorY[0]*vectorX[i]==0)){
                    flag=false;
                    break;
                }
            }

            if(flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


         }

    }
}
