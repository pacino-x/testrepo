package cn.xay.DateCalenderDemo;

import java.util.Calendar;
import java.util.Date;

public class DateCalenderDemo {
    public static void main(String[] args) {
        //date类，操作时间相关的信息
        //测试空参构造
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println("---------------------------------------------");
        //获取当前操作系统的毫秒值
        long t1 = d1.getTime();
        System.out.println(t1);

        //calendar是抽象类，不能直接用，或者用getInstance();
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1);
        System.out.println("---------------------------------------------");
        int year = c1.get(Calendar.YEAR);
        System.out.println(c1);
    }
}
