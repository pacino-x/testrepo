package cn.xay.array;
//遍历数组
/*
直接输出数组名，打印的是数组的地址
没有手动赋值的元素默认值为0；
 */
public class AccessArray2 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        //获得数组的长度：数组名.length
//数组的最大索引是length - 1
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
