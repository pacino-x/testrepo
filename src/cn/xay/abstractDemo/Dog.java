package cn.xay.abstractDemo;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    //抽象方法要求子类必须重写
    //生成快捷键alt+enter

}
