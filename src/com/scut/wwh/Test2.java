package com.scut.wwh;

import java.io.*;

/**
 * Created by scut-313 on 2017/2/28.
 */
public class Test2  implements  Serializable{
    public void update(){
       //File file=new File();
      //FileInputStream fis=new FileInputStream();

    }
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        char[] buf =new char[1024];

        try {
            FileReader fr=new FileReader("file");
            while(fr.read(buf)>0){
                sb.append(buf);
            }
            sb.toString();

        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
