package edu.xcdq.demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/5/13 17:31
 */
//实现文件的复制
public class demo02 {
    public static void main(String[] args) throws Exception {
        //  1  准备输入输出流
        FileInputStream fi = new FileInputStream("D:\\Visual Studio Code.lnk");
        FileOutputStream fo = new FileOutputStream("C:\\des\\Visual Studio Code.lnk");

        int len = 0;
        byte[] b = new byte[1024];
        while ((len = fi.read(b)) != -1){
            fo.write(b);
        }
        fi.close();
        fo.close();
    }

}
