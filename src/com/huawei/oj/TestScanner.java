package com.huawei.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/9.
 */
public class TestScanner {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          while(sc.hasNext()){
              int s1=sc.nextInt();
              int s2=sc.nextInt();
              String s3=sc.nextLine();
              System.out.println(s1);
              System.out.println(s2);
              System.out.println(s3);
          }

        }

 /*   public static void main(String[] args) throws FileNotFoundException {
        InputStream in = new FileInputStream(new File("C:\\AutoSubmit.java"));
        Scanner s = new Scanner(in);
        while(s.hasNextLine()){
            System.out.println(s.nextLine());
        }
    }*/



}
