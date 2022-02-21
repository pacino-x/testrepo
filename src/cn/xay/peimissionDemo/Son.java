package cn.xay.peimissionDemo;

public class Son extends Father{
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.show4();
        s1.show3();
        s1.show2();
        /*
        这说明，同一个包下的子类中，不能访问父类private类型的方法，其他都可以
         */
    }
}
