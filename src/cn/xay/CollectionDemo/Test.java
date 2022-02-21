package cn.xay.CollectionDemo;

import java.util.ArrayList;
import java.util.List;

/*
单列集合中的List集合
    特点：有序（存取顺序一致），元素可重复
    List list = new ArrayList();

    List接口中的成员方法：public boolean add(E,e);//将数据添加到集合的末尾，E是泛型的意思
    public E get(int index);//根据索引，索取其对应的元素
    public int size();//获取集合的长度
 */
public class Test {
    public static void main(String[] args) {
        //使用集合的步骤
        //1.创建集合对象
        List list = new ArrayList<>();

        //2.创建元素对象
        Student s1 = new Student("乔峰",40);
        Student s2 = new Student("金轮",45);
        Student s3 = new Student("段誉",35);

        //3.将元素对象添加到集合对象中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //直接打印集合
        System.out.println(list);
        //获取索引为2的元素
        Object o1 = list.get(2);
        System.out.println("索引为2的元素是"+o1);
        //获取集合元素个数
        System.out.println("集合长度等于"+list.size());
        System.out.println("---------------------------------------");
        //.遍历集合
        for (int i = 0;i < list.size();i++){
            Object o2 = list.get(i);
            System.out.println("索引为"+i+"的元素是"+o2);
        }
    }
}
