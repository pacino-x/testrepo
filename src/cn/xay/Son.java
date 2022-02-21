package cn.xay;

import cn.xay.peimissionDemo.Father;

public class Son extends Father {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.show3();
        s1.show4();
        /*
        说明，不同包下的子类，可以访问（继承到）的方法是protected和public类型的方法。
         */
    }
}
