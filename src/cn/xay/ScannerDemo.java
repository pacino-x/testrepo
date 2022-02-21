package cn.xay;

import java.util.Scanner;//导入包

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建键盘录入对象


        //接收数据
        int i = sc.nextInt();//执行时等待用户输入数据
        System.out.println("this is"+i);
    }
}
