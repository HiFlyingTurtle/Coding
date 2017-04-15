package com.huawei.oj;
import java.util.Scanner;
/**
 * Created by WWH on 2017/4/8.
 * 华为在线编程验证密码是否合格
 */
public class VerifyPassCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String line=sc.nextLine();
            boolean flag=true;

            if(line.length()<=8||line==null) {
                flag=false;
            }else{
                int []cal=new int[4];
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i)>='a'&&line.charAt(i)<='z'){
                        cal[0]=1;
                    }else if(line.charAt(i)>='A'&&line.charAt(i)<='Z') {
                        cal[1]=1;
                    }else if(line.charAt(i)>='0'&&line.charAt(i)<='9'){
                        cal[2]=1;
                    }else {
                        cal[3]=1;
                    }

                }
                if(cal[0]+cal[1]+cal[2]+cal[3]<3){
                    flag=false;

                }

                for(int i=0;i<line.length()-3;i++){
                    String str=line.substring(i,i+3);
                    String leaveStr=line.substring(i+3);
                    if(leaveStr.contains(str)){
                        flag=false;
                    }
                }
            }

            if(flag){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }



        }
    }
}
