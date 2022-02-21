package cn.xay.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
想要set集合去重，需要重写student类中的equals方法和hashcode方法
 */
public class Test {
    public static void main(String[] args) {
        //需求：往set集合中添加5个学生对象，然后遍历。
//1.创建集合对象,泛型为student的set集合
        Set<Student> set = new HashSet<>();

// 2.创建元素对象
        Student s1 = new Student("乔峰",39);
        Student s2 = new Student("段誉",32);
        Student s3 = new Student("虚竹",35);
        Student s6 = new Student("虚竹",35);
        Student s4 = new Student("虚3",35);
        Student s5 = new Student("虚2",35);
// 3.将集合对象添加到元素对象中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

// 4.遍历集合
        System.out.println(set);//直接输出，就全部在一块
        //通过迭代器遍历set集合
        System.out.println("通过迭代器遍历set集合");
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
            //通过增强for遍历set集合
            System.out.println("通过增强for遍历set集合");
            for (Student student : set) {
                System.out.println(student);
            }

    }
}
