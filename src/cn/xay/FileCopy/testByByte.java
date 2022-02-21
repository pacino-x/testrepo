package cn.xay.FileCopy;

import java.io.*;

//通过普通字节流，一次读取一个字节来复制文件
public class testByByte {
    public static void main(String[] args) throws IOException {
        //进行IO对象声明
        FileInputStream fi = new FileInputStream(new File("lib/a/lions.jpg"));
        FileOutputStream fo = new FileOutputStream(new File("lib/a/mountain.jpg"));
        //循环，然后操作
        int x;
        while ((x = fi.read())!= -1){
            fo.write(x);
        }
        //关闭资源
        fi.close();
        fo.close();

    }
}
