package cn.xay.FileCopy;

import java.io.*;

public class testBufferedStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/a/lions.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/a/mountain.jpg"));
        int b;
        while ((b = bis.read())!=-1){//这里read方法的返回值是读取到的内容
            bos.write(b);
        }
        //关闭资源
        bis.close();
        bos.close();
    }
}
