package edu.xcdq;

import java.io.File;
import java.io.IOError;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/5/12 11:20
 */
public class Main {
    public static void main(String[] args) /*throws IOError*/ {
        File file = new File("D:\\classthree.text");
        File file1 = new File("d:/three.text");
        File file2 = new File("d:/ch0512 s/demo01");
        File file3 = new File("d:/ch2021 05 12");
        try {
            file.createNewFile();
            file1.createNewFile();
            file2.mkdirs();
            /*file2.mkdirs();  //创建多层文件夹
            file3.mkdir();   //创建一层文件夹
            file1.delete();  //删除文件
            file2.delete();  //删除为空的那一级文件夹
            file3.renameTo(new File("d:/ch21 05 12"));  //修改路径*/
            System.out.println(file.exists());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println(file.getPath());

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
