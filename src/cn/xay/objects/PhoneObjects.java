package cn.xay.objects;
/*
定义一个手机类
 */
public class PhoneObjects {
    //成员变量：在类中，方法外的变量
    String brand;
    String model;
    String name;
    //成员方法：不需要static修饰符
    public void call(String name) {
        System.out.println("给"+name+"打电话");
    }
    public void sendMessage() {
        System.out.println("发短信");
    }
    public void playGame() {
        System.out.println("玩游戏");
    }
}
