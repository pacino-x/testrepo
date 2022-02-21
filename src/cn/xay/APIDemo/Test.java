package cn.xay.APIDemo;
/*
    Object类：
    成员方法：
    int hashcode():返回对象的哈希码值
    class<?> getClass():返回该调用者的字节码文件对象
    String toString():返回该对象的字符串表示形式
    boolean equals():比较两个对象是否相等
 */
public class Test {
    public static void main(String[] args) {
        //非静态方法：通过对象名.  的形式调用
        Object obj1 = new Object();
        Object obj2 = new Object();

        //测试Object类的成员方法
        int code1 = obj1.hashCode();
        int code2 = obj2.hashCode();
        System.out.println(code1);
        System.out.println(code2);//不同对象的哈希码值一般不同

        //class<?> getClass():返回该调用者的字节码文件对象,一个类只有一个字节码文件对象
        Class cla1 = obj1.getClass();
        Class cla2 = obj2.getClass();
        System.out.println(cla1);
        System.out.println(cla2);

        //String toString():返回该对象的字符串表示形式,默认打印地址值，不同对象地址值不同
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        System.out.println(s1);
        System.out.println(s2);

        //boolean equals():比较两个对象是否相等,默认比较地址值
        boolean b1 = obj1.equals(obj2);
        System.out.println(b1);
    }
}
