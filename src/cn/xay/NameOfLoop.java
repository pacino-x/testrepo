package cn.xay;
//按照班级查找某同学，已知有三个班级，每个班级十个同学，第二个班级的第五个同学是要找的。
public class NameOfLoop {
    public static void main(String[] args) {
        label_class:for (int i =1; i <4; i++) {
            for (int j = 1;j < 11;j++) {
                System.out.println("正在查找的是第"+i+"个班级的第"+j+"个同学");
                if (i == 2&& j == 5){
                    System.out.println("找到了要找的同学！");
//                    break;//break直接使用，是结束当前循环。给起了名字（标号）的循环使用，可以结束指定的循环。
                    break label_class;//点名结束指定的循环
                }
            }
            System.out.println();
        }
    }
}
