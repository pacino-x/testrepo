package cn.xay;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner time1 = new Scanner(System.in);
        System.out.println("input a hour:");
        int time = time1.nextInt();
        if (time < 12 && time > 0) {
            System.out.println("good morning!");
        } else if (time > 12 && time < 18) {
            System.out.println("good noon!");
        } else if (time > 18 && time < 25) {
            System.out.println("good evening!");
        } else {
            System.out.println("cannot recognize!");
        }
    }
}
