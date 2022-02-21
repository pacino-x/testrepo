package cn.xay.reflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class testGetter {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("cn.xay.reflectDemo.Student");
        Constructor con = clazz.getConstructor(String.class);
        Student st1 = (Student)con.newInstance("xay");
        Student st2 = (Student)con.newInstance("second");
        Method meth1 = clazz.getMethod("getName");
        meth1.setAccessible(true);
        System.out.println(meth1.invoke(st1));
        System.out.println(meth1.invoke(st2));
        System.out.println("----------------");
        Method meth2 = clazz.getMethod("setName", String.class);
        meth2.invoke(st1,"second+xay");
        System.out.println(meth1.invoke(st1));
        meth2.invoke(st2,"second");
        System.out.println(meth1.invoke(st2));
    }
}
