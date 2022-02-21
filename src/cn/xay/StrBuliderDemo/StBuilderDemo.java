package cn.xay.StrBuliderDemo;

public class StBuilderDemo {
    /*StringBuilder有空参和带参构造
    空参构造创建一个空的StringBuilder容器，带参构造在创建容器的同时添加指定的字符串（参数输入的）
     */
    /*
    常用的成员方法：append();将任意类型的数据添加到容器中
    toString();将当前容器转换成字符串
     */
    public static void main(String[] args) {
        //测试构造方法
        //空参
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("abc");
        System.out.println(sb2);
        //带参//将String类型转换为StringBuilder类型
        StringBuilder sb3 = new StringBuilder("default String");
        sb3.append("-is this");
        System.out.println(sb3);
        System.out.println("----------------------------------------------");
        sb3.toString();
        System.out.println(sb3);
        System.out.println("----------------------------------------------");

    }
}
