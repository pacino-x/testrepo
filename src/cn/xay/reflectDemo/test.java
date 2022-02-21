package cn.xay.reflectDemo;
//一个源文件只能对应一个字节码文件
public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class对象（字节码文件对象）的三种方式
        //1.object类的getClass方法
        Student s1 = new Student();
        Class clazz1 = s1.getClass();
        //2.类的静态属性
        Class clazz2 = Student.class;
        //3.Class类的静态方法
        Class clazz3 = Class.forName("cn.xay.reflectDemo.Student");
    }
}
