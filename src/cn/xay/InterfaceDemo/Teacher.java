package cn.xay.InterfaceDemo;
//接口smoking的实现类（子类）
public class Teacher implements Smoking{
    @Override
    //这个接口类要实现抽象方法
    public void smoke() {
        System.out.println("老师说抽烟有害");
    }
}
