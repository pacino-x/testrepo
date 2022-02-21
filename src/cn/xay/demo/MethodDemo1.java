package cn.xay.demo;

public class MethodDemo1 {
    public static void main(String[] args) {//这个就是main方法
        System.out.println(sum(1,3));
    }
    /*
    定义方法注意：1.方法和方法是平级的，不能嵌套定义。
    2.要注意明确三个东西：明确方法名、返回值的类型、参数列表。
    下面定义一个方法
     */
    public static int sum(int a,int b) {
        int c = a + b;
        return c;
    }
}
