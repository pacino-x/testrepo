package cn.xay;

import cn.xay.inherit.Child;
import cn.xay.peimissionDemo.Son;

public class TestPermission {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.show4();
//        s1.show3();
        /*
        这说明，不同包下面的无关类（无继承关系），只能访问父类中的public方法
         */
    }
}
