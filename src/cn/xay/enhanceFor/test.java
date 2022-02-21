package cn.xay.enhanceFor;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        /*
        通过增强for遍历list集合
        快捷方式：iter+enter
        1.创建集合对象
        2.创建元素对象
        3.将元素对象添加到集合对象中
        4.遍历集合

         */
        List list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);//这些数据现在是Object类型

        for (Object obj:list){
            //obj是集合中的元素，其本身是Integer类型的数据
            Integer i = (Integer)(obj);
            System.out.println(i);
        }
        System.out.println("------------------------------");
        for (Object o : list) {
            Integer i = (Integer)(o);
            System.out.println(i);
        }
    }
}
