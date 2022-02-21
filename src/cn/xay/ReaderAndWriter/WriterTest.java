package cn.xay.ReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        //字符流写数据，可以按照单个字符也可以按照字符数组。
        //1.创建writer对象
        Writer writer = new FileWriter("lib/abc/1.txt");
        String x = "好";//字符的底层是整数
        writer.write(x);
        //按照字符数组形式写入
        char[] chs = {'虎','虎','生','威'};
        writer.write(chs);
        System.out.println("---------------------------");
        //第三种方式，按照字符串写入
        writer.write("用字符串写入的形式，写入的一个字符串，这样很简单，用writer.write(字符串)这样的形式就可以");
        //要关闭资源
        writer.close();
    }
}
