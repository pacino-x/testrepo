package cn.xay.demo;
//输入两个整数并且求他们的和
import java.util.Scanner;

public class ScannerDemo2{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("input two int:");
        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = a+b;
        System.out.println("a+b="+c);
    }
}
