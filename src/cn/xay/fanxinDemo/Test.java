package cn.xay.fanxinDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //不使用泛型的集合
        List list1 = new ArrayList();//1.创建集合对象
        list1.add("a");
        list1.add("b");
        list1.add("c");//将元素对象添加到集合中
//        list1.add(10);//会报类型转换异常ClassCastException
        for (Object obj : list1) {//遍历循环
            String s = (String)obj;
            System.out.println(s);
        }
        System.out.println("------------------------------");
        //使用泛型
        List<String> list2 = new ArrayList<String>();//1.创建集合对象
        list2.add("abc");
        list2.add("bcd");
        list2.add("cdr");
//        list2.add(10);//代码会自动报错。因为使用了泛型
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
