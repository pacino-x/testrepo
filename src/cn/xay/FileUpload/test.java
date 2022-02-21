package cn.xay.FileUpload;

import java.io.*;
import java.util.Scanner;

//模拟文件上传功能
/*
a.控制台录入路径
b.解析路径字符串后缀名是否合法：包括bmp、jpg、png
c.判断该路径表示的文件对象是否存在以及是否为文件
    file.exists();
    file.isFile();
d.读取该文件并且写入指定目录
e.提示上传成功或者失败
 */
public class test {
    public static void main(String[] args) throws IOException {
        String str = GetPath();
        System.out.println("path =" + str);
        boolean flag = CheckPath(str);
        System.out.println("flag=" + flag);
        if (flag) {
            System.out.println("输入目标路径：");
            Scanner sc1 = new Scanner(System.in);
            String dest = sc1.nextLine();
            readAndWrite(str, dest);
        } else System.out.println("路径不合法！");
        System.out.println("头像上传成功！");
    }


    public static String GetPath() {
        System.out.println("请输入文件路径：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }


    public static boolean CheckPath(String str) {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        if (str.endsWith(".jpg") || str.endsWith(".png") || str.endsWith(".bmp")) {
            flag1 = true;
            System.out.println("flag1="+flag1);
        }
//        if (flag1) {
            File f = new File(str);//一个重要问题：str作为字符串传入参数，不需要加引号
            if (f.exists() && f.isFile()) {
                flag2 = true;
                System.out.println("flag2="+flag2);
            }//这里要先确定路径没问题，再使用new文件对象
//        }
        if (flag1 && flag2) {
            flag = true;
        }
        return flag;
    }

    public static void readAndWrite(String str, String dest) throws IOException {
        //BufferedReader是字符流，BufferedInputStream是字节流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(str));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}