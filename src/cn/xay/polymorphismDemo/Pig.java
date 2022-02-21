package cn.xay.polymorphismDemo;

public class Pig extends Animal{
    @Override
    public void eat(){
        System.out.println(getName()+"猪在吃东西");
    }
}
