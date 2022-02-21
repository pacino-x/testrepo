package cn.xay.reflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//通过反射方式创建Student类型的对象
public class test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Student s1 = new Student();//不使用反射
        //使用反射
        //1.获取指定类的字节码文件对象
        Class clazz = Class.forName("cn.xay.reflectDemo.Student");
        //2.根据字节码文件对象，获取指定的构造器对象
        //2.1获取公共无参构造
        Constructor con1 = clazz.getConstructor();
        System.out.println("con1="+con1);
        //2.2获取公共有参构造
        Constructor con2 = clazz.getConstructor(String.class);
        System.out.println("con2="+con2);
        //2.3获取私有有参构造
        Constructor con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println("con3="+con3);
        //2.4获取Student类所有公共构造函数
        System.out.println("下面获取所有公共构造函数：");
        Constructor[] cons = clazz.getConstructors();
//        System.out.println("cons="+cons);要用增强for遍历
        for (Constructor con : cons) {
            System.out.println(con);
        }
        //3.根据构造器对象和参数，创建对应的学生类对象
        Student xa = (Student) con2.newInstance("xay");
        //4.获取该类的成员方法对象，然后调用此方法
//        System.out.println("xa="+xa);
        //4.1调用公共的空参方法
        Method method1 = clazz.getMethod("show1");
        System.out.println(method1);
        //打印方法名
        System.out.println("name ="+method1.getName());
        //调用此方法
        System.out.println("-------------");
        method1.invoke(xa);
    }
}
