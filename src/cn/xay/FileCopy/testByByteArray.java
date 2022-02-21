package cn.xay.FileCopy;

import java.io.*;

//按照字节数组来读写
public class testByByteArray {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("lib/a/tiger.jpg"));
        FileOutputStream fos = new FileOutputStream(new File("lib/a/mountain.jpg"));
        //循环读取和写入
        byte[] by = new byte[1024];
        int b;//b接收read返回的值，就是对应读取文件的字节长度
        while ((b = fis.read(by))!=-1) {//这里read方法的参数要注意
            fos.write(by,0,b);
        }
        //关闭资源
        fis.close();
        fos.close();
    }
}
