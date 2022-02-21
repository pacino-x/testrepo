package cn.xay;
import java.util.Random;
public class RandomDemo {
    //获取一个随机数
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);//这个范围是0-10，前闭后开，可以取到0不可以取到10.
        System.out.println(num);
    }

}
