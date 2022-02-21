package cn.xay.FileCopy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//按照字符数组来复制
public class test2 {
    public static void main(String[] args) throws IOException {
        //1.创建读写文件对象
        //这里直接用FileReader和FileWriter是一样的
        FileReader fr = new FileReader("lib/a/source2.txt");
        FileWriter fw = new FileWriter("lib/a/dest2.txt");
        //2.进行操作
        char[] chs = new char[1024];//这个长度有优化空间，否则其余空间显示为null
        int len = fr.read(chs);//这个方法的返回值是字符个数
        //优化为使用write(chs,0,len)这个方法，标注长度。
        fw.write(chs,0,len);
        //3.关闭资源
        fr.close();
        fw.close();
    }
}
