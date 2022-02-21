package cn.xay.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];//第一种定义数组的方法,这是没有初始化的
        int[] arr2 = new int[]{1,2,3};//直接给出元素，不存在空间的浪费
        int[] arr3 = {1,2,3};//第二种方式的简化
        System.out.println(arr3);
        int[] ans = {1,2,3};
        System.out.println(ans.length);
    }
}
