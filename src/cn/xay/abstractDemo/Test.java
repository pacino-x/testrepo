package cn.xay.abstractDemo;

public class Test {
    public static void main(String[] args) {
        //测试
        Dog d1 = new Dog();
        d1.eat();
        mouse m1 = new mouse();
        m1.eat();
        Cat c1 = new Cat();
        c1.eat();
        System.out.println("-----------------------------");
        //通过多态测试
        Animal an1 = new Dog();
        an1.eat();

        Animal an2 = new mouse();
        an2.eat();

        Animal an3 = new Cat();
        an3.eat();
    }
}
