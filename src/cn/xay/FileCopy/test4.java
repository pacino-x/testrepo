package cn.xay.FileCopy;

import java.io.*;

//字符缓冲流一次读取一行,用public String readline();这个方法
public class test4 {
    public static void main(String[] args) throws IOException {
        //BufferedReader是字符流，BufferedInputStream是字节流
        BufferedReader br = new BufferedReader(new FileReader("lib/a/source4.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/a/dest4.txt"));
        String str;
        while ((str = br.readLine())!=null){
            bw.write(str);
            bw.write("\n");//手动换行
            //java中，根据操作系统自动给出对应换行符的方法：public void newLine();
            bw.newLine();
        }
        //关闭资源
        br.close();
        bw.close();
    }
}
