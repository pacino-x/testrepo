package cn.xay;

import java.util.Scanner;

public class CompareDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个要比较的整数");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(compare(num1,num2));
    }
    public static boolean compare(int a,int b) {
        boolean flag = true;
        if (a == b);
        else flag = false;
        return flag;//直接return a==b;
    }
}
