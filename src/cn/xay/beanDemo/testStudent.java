package cn.xay.beanDemo;

public class testStudent {
    public static void main(String[] args) {
        Student s1 = new Student("张三",21);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.setAge(321);
        s1.setName("xayah");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

    }
}
