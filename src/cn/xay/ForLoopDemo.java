package cn.xay;
//输出所有的水仙花数，水仙花数是一个三位数，各位数字的立方和等于该数字本身
import java.util.Scanner;
/*
百位数字：i/100
十位数字：(i%100)/10
个位数字：i%10
 */
public class ForLoopDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int i;
        int j = 1;
        int thr = 0;//依次是百位、十位、个位
        int two = 0;
        int one = 0;
        for (i = 100;i < 1000; i++){
            thr = i/100;
            two = (i%100)/10;
//            thr = i/10/10%10;
//            two = i/10%10;
            one = i%10;
            if (i == (thr*thr*thr + two*two*two +one*one*one)){
                System.out.println("第"+j+"个水仙花数是："+i);
                j ++;
            }
        }
    }
}
