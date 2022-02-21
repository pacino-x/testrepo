package cn.xay;

import java.io.File;
import java.util.Scanner;

/**
 * 尝试使用java，这是文档注释。
 */

public class helloworld {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println(850/100);
        Scanner sc = new Scanner(System.in);
        System.out.println("输入路径：");
        String str = sc.nextLine();
//        System.out.println("path ="+str);
        File f = new File(str);
        boolean flag1 = (f.isFile());
        boolean flag2 = (f.exists());

        System.out.println("flag1="+flag1);
        System.out.println("flag2="+flag2);
    }
}
