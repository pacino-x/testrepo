package cn.xay;

import java.util.Random;
import java.util.Scanner;

//猜数字
public class GaussNumber {
    public static void main(String[] args) {//main函数就是一个方法
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int num = ra.nextInt(100) + 1;//获取一个范围在1-100的 随机数字
        dloop:while (true) {
            System.out.println("输入你的数字：");
            int gau = sc.nextInt();
            if (gau > num){
                System.out.println("你猜的数字大了");
            }
            else if (gau < num){
                System.out.println("你猜的数字小了");
            }
            else if (gau == num){
                System.out.println("你猜对了！");
                break dloop;
            }
        }return;
    }
}
