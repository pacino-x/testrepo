package cn.xay.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class useCollection {
    public static void main(String[] args) {
        List <Integer> lit = new ArrayList<>();
        lit.add(2);
        lit.add(32);
        lit.add(25);
        lit.add(98);
        lit.add(56);
        int max = Collections.max(lit);//好像使用泛型与否都可以
        System.out.println(max);
        System.out.println("--------------------------------------");
        List <Integer> lit1 = new ArrayList<>();
        Collections.sort(lit);
        System.out.println(lit);
        System.out.println("--------------------------------------");
        Collections.reverse(lit);
        System.out.println("升序之后，反转的结果"+lit);
        Collections.shuffle(lit);//作用是随机打乱
        System.out.println("--------------------------------------");
        System.out.println(lit);
    }
}
