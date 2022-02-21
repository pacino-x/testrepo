package cn.xay.objects;
/*
用于测试手机类phone
 */
public class TestPhone {
    //main函数是程序的主入口，动作从这里开始
    public static void main(String[] args) {
        //创建对象
        PhoneObjects p = new PhoneObjects();

        //给成员变量赋值
        p.brand = "apple";
        p.model = "x";
        p.name = "手机名字";
        //调用成员变量的值
        System.out.println(p.brand);
        System.out.println(p.model);
        System.out.println(p.name);
        System.out.println("---------------------------");
        //调用成员方法
        p.call("雷军");
        p.sendMessage();
        p.playGame();
    }
}
