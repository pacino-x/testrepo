package cn.xay.ReaderAndWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        //字符流读取数据
        //int read()方法，读一个字符，返回对应字符的ASCII码值，读不到返回-1.
        //1.创建输入流对象
        Reader reader = new FileReader("lib/1.txt");
        //2.读取数据
//        int read = reader.read();
        int flag;//如果是在while语句里声明flag，会出现麻烦
        while (( flag = reader.read())!=-1) {
            //read()方法每执行一次，下次读取的字符会进一，所以每步只能读一个
            System.out.println(flag);
        }
        //3.释放资源
        reader.close();
    }
}
