package cn.xay.polymorphismDemo;
/*
polymorphism多态
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
        //全参构造，可以自动生成
    }

    public Animal(){
        //空参构造
    }

    public void eat() {
        System.out.println("吃东西");
    }
}
