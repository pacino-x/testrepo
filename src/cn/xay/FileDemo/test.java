package cn.xay.FileDemo;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File file1 = new File("lib/1.txt");
        //获取绝对路径，这个get方法返回值可以用String 接收
        System.out.println("绝对路径:"+file1.getAbsolutePath());
        //获取相对路径
        System.out.println("相对路径:"+file1.getPath());
        //获取文件名
        System.out.println("文件名:"+file1.getName());
        System.out.println("------------------------------------");
        //获取lib下的所有文件夹名称数组
        File file2 = new File("lib");
        String[] name = new String[0];
        name = file2.list();
//        System.out.println("名称数组："+name)这个遍历要用增强for
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println("--------------------------");
        //获取lib下所有文件的file对象数组，要用file类型数组做接收
        File[] files = file2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
