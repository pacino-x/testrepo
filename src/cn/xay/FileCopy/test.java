package cn.xay.FileCopy;

import java.io.*;

public class test {
    //第一种复制方式，按照单个字符拷贝
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("lib/source.txt");
        Writer writer = new FileWriter("lib/dest.txt");
        int ch;
        while ((ch = reader.read())!=-1){
            writer.write(ch);//ch是int类型，write之后直接转换成了文字，而不是其ASCII码
        }

        //记得关闭资源
        reader.close();
        writer.close();
    }
}
