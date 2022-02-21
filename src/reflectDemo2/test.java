package reflectDemo2;

import cn.xay.reflectDemo.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取字节码文件对象
        Class clazz = Class.forName("cn.xay.reflectDemo.Student");
        //获取该类的构造器对象，然后创造Student类对象
        Constructor con1 = clazz.getConstructor();
        Student stu1 = (Student) con1.newInstance();
        System.out.println(stu1);
//        stu1.show1();这样也可以用，但好像达不到目的
        //获取该类成员方法对象，然后调用。

    }
}
