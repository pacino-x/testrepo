package cn.xay.inherit;

public class TestAnimal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("哮天犬");
        d1.setAge(12);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        d1.eat();


        Pig p1 = new Pig();
        p1.snore();
    }
}
