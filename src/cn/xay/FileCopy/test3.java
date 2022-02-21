package cn.xay.FileCopy;

import java.io.*;

//字符缓冲流拷贝文件，就是BufferedReader和BufferedWriter
public class test3 {
    public static void main(String[] args) throws IOException {
        //这个声明字符流读写文件对象的方式是比较特别。一个语句里new两次
        //因为高效字符输入输出流Buffered构造方法就是这样的，它自带了缓冲区
        //底层按照字符数组写入的，大小为8192个字符
        BufferedReader br = new BufferedReader(new FileReader("lib/a/source3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/a/dest3.txt"));
        int len;
        while ((len = br.read())!=-1){
            bw.write(len);
        }

        //记住关闭资源
        br.close();
        bw.close();
    }
}
