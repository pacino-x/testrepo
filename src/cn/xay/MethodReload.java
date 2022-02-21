package cn.xay;
//方法重载
import java.util.Scanner;

public class MethodReload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    int num1 = sc.nextInt();
//    int num2 = sc.nextInt();
        int num1 = 120;
        int num2 = 120;
        long num3 = 10200312;
        long num4 = 12319213;
        double num5 = 23.4;
        double num6 = 21.3;
        boolean flag1 = compare(num1,num2);
        System.out.println("num1 equal num2 is "+flag1);
        boolean flag2 = compare(num3,num4);
        System.out.println("num3 equal num4 is "+flag2);
        boolean flag3 = compare(num5,num6);
        System.out.println("num5 equal num6 is "+flag3);
    }

    public static boolean compare(int a,int b) {
        return a==b;
    }
    public static boolean compare(long a,long b) {
        return a==b;
    }
    public static boolean compare(double a,double b) {
        return a==b;
    }

}
