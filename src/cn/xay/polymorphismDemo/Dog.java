package cn.xay.polymorphismDemo;

//Animal的子类
public class Dog extends Animal{
    //需求：狗吃骨头，优化父类中的eat方法
    @Override
    public void eat() {
        System.out.println(getName()+"狗在吃骨头");
    }
}
