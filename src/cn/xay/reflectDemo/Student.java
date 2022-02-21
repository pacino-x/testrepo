package cn.xay.reflectDemo;

public class Student {
    public Student() { }//公共无参构造
    private String name;
//    private int age;
    public Student(String name){
        this.name = name;
    }//公共带参构造
//    private Student(int age){
//        System.out.println("age ="+age);
//    }//私有带参构造
    public  void show1(){
        System.out.println("我是公共空参方法show1的输出");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

