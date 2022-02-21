package cn.xay.inherit;

public class Animal {
    private  String name;
    private int age;
    private String sex;
//    public Animal(String name,int age);
    //继承中子父类构造方法的关系
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat(){
        System.out.println(this.name+"在吃饭");
    }
}
