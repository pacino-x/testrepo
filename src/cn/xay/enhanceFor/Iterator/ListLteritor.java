package cn.xay.enhanceFor.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListLteritor {
    /*
        需求：判断集合中如果有字符串"b"，就在其后边添加一个字符串"java"
         */
    public static void main(String[] args) {
        //通过迭代器遍历list集合
        /*
        迭代器使用步骤：
        1.根据集合对象获取其对应的迭代器对象
        2.判断迭代器中是否有对象
        3.如果有就获取元素
         */
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        1.根据集合对象获取其对应的迭代器对象

        ListIterator lit = list.listIterator();
       // 2.判断迭代器中是否有对象
        while (lit.hasNext()) {//如果有元素就一直遍历
            String s = (String)lit.next();
            if ("bbb".equals(s)){//这种常量放在前面的比对方式,可以规避空指针异常
//                list.add("java");
//                ConcurrentModificationException，并发修改异常，遍历集合时修改或添加导致的
                //可以使用列表迭代器,通过调用列表迭代器的方法实现
                lit.add("java");
            }

            System.out.println(s);
        }
        System.out.println("________________________________________");
        System.out.println(list);
    }
}
