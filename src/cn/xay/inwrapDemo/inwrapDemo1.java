package cn.xay.inwrapDemo;

public class inwrapDemo1 {
    public static void main(String[] args) {
        /*
        static int parseInt(String):将字符串类型的整数转换成对应的int类型整数
         */
        int a = 10;//变量a是基本类型，不能通过对象名.的形式调用方法
        //解决方法：通过包装类

        //装箱
        Integer i1 = new Integer(20);//已过时的写法
        //拆箱
        int b = i1.intValue();
        System.out.println(i1);
        System.out.println(b);
        System.out.println("-------------------------------------------------------");
        //自动拆装箱
        Integer i2 = 20;//装箱
        int c = i2;//拆箱
        System.out.println(i2);
        System.out.println(c);
        System.out.println("-------------------------------------------------------");
//将字符串类型的"10"转换成整数类型的10
        String s1 = "10";
        int num = Integer.parseInt(s1);
        System.out.println(num);
        System.out.println("-------------------------------------------------------");
        short sht1 = Short.parseShort(s1);

    }
}
