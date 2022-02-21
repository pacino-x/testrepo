package cn.xay.inherit;

public class Test {
    public static void main(String[] args) {
        //这是程序的主入口，所有代码从这里开始
        Child c1 = new Child();
        c1.setAge(32);
        System.out.println(c1.getAge());
//        c1.age;父类的私有成员，子类不能直接访问
    }
}
