package cn.xay.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
map属于双列集合
 */
public class test {
    public static void main(String[] args) {
        //需求：往map集合中添加三个学生对象然后打印
        Map<Integer,Student> map = new HashMap<>();
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",53);
        Student s3 = new Student("张三",13);
//        Student stu1 = map.put(1,s1);
//        System.out.println(stu1);

        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        Student ss = map.get(1);        System.out.println(map);
        //用keySet获取键的集合
        //使用增强for来遍历map
        System.out.println("------------------------------");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
        //使用迭代器来遍历map
        System.out.println("------------------------------");
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            Student val = map.get(it.next());
            System.out.println(val);
        }

    }
}
