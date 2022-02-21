package cn.xay.ReaderAndWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest2 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("lib/1.txt");
        char [] chs = new char[4];
        int len = reader.read(chs);//把字符读取到数组中，返回读取的字符数量，如果读到流的末尾返回-1
        System.out.println("len="+len);
        System.out.println(chs);//字符串的底层是字符数组，打印时会自动拼接成字符串
        //最后要记得关闭资源
        reader.close();
    }
}
