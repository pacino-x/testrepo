package cn.xay.beanDemo;
//定义一个标准的JavaBean类
public class Student {
    //成员变量全部用private修饰
    private String name;
    private int age;
    //构造方法：无参。全参
    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        //用this给构造函数传值
    }
    //公共访问方式：get、set

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
