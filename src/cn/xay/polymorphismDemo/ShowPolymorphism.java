package cn.xay.polymorphismDemo;
/*
演示多态
 */
public class ShowPolymorphism {
    public static void main(String[] args) {
        /*
        Java中实现多态需要的条件：
        1.有继承关系
        2.有方法重写
        3.有父类引用指向子类对象
         */
        //这就是多态：
        Animal an = new Dog();
        an.setName("哈士奇");
        an.eat();
    }
}
