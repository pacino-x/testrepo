package cn.xay.array;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr1 = {12,32,123,423,123,43};
        int max = 0;
        for (int i = 0;i < arr1.length;i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println("数组中的最大值是"+max);
    }
}
