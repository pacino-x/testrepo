package cn.xay.enhanceFor.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //通过迭代器遍历list集合
        /*
        迭代器使用步骤：
        1.根据集合对象获取其对应的迭代器对象
        2.判断迭代器中是否有对象
        3.如果有就获取元素
         */
        List <String> list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        1.根据集合对象获取其对应的迭代器对象
        Iterator it = list.iterator();
//        2.判断迭代器中是否有对象
        while (it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------");
        /*
        需求：判断集合中如果有字符串"b"，就在其后边添加一个字符串"java"
         */
//        while (it.hasNext()){
//            String str = (String) it.next();
//            if ("bbb".equals(str)){
//                list.add("java");
//                System.out.println("1");
//            }
//        }
        System.out.println(list);
    }
}
