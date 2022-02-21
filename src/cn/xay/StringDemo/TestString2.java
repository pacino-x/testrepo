package cn.xay.StringDemo;

import java.nio.charset.StandardCharsets;
//String类的转换功能
public class TestString2 {
    public static void main(String[] args) {
        String s1 = "abc";
        //byte[] getBytes();将字符串转换成字节数组
        byte[] bys = s1.getBytes(StandardCharsets.UTF_8);//97,98,99
        for (int i = 0; i < bys.length;i++){
            System.out.println(bys[i]);
        }
        System.out.println("--------------------------------------------");

        //char[] toCharArray();将字符串转换成字符数组
        char[] chs = s1.toCharArray();
        for (int i = 0; i < chs.length;i++)
            System.out.println(chs[i]);
        System.out.println("--------------------------------------------");

        //static String valueOF():将指定类型数据转换成字符串
        //静态方法通过类名直接调用
        int num = 123;
        String s2 = String.valueOf(num);
        System.out.println("now s2 = "+s2);
        System.out.println("--------------------------------------------");
        //实际开发中的一般做法：
        String s3 = "" + s2;
        System.out.println(s3+4);//输出1234说明已经不再是整型，而是字符串了
        System.out.println("--------------------------------------------");
        //ctrl+d复制一行，shift+alt+上下箭头移动行
        //string replace(old,new)
        String s4 = "abc abc abc";
        System.out.println("now s4 = "+s4.replace('b','d'));
        System.out.println("--------------------------------------------");
        //String[] split(String):切割字符串，返回切割后的字符串数据，原字符串不变
        //将s4按照空格进行切割"abc abc abc"
        String[] arr = s4.split(" ");
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------------------------");
        //String trim():去除字符串两端的空白字符
        String s5 = "         abcabcabc   ";
        System.out.println("before trim:"+s5);
        System.out.println("after trim:"+s5.trim());
        System.out.println("--------------------------------------------");
    }
}
