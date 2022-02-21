package cn.xay.reflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("cn.xay.reflectDemo.Student");
        Constructor con = clazz.getConstructor(String.class);
        Student st1 = (Student)con.newInstance("xay");
//        String  st2 = (String) clazz.getConstructor().newInstance("second");链式编程
        //当一个方法返回值还是一个对象的时候，可以在它后边继续接.方法名
        st1.setName("xay");
        System.out.println(st1);
        System.out.println("--------------");
        Field field1 = clazz.getDeclaredField("name");
        field1.setAccessible(true);
        field1.set(st1,"sec");
        System.out.println(st1);
    }
}
