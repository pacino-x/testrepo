package cn.xay;
//按班级发橙子，三个班级每个班级35人，要将100个橙子发给每个同学，每人拿一个
//如果某人已经有了橙子，就不给他发放，发完活动终止
//假设编号为5的倍数的同学已经有了橙子
public class FestivalDemo {
    public static void main(String[] args) {
        int cnt = 100;
        cla:for (int i = 1;i < 4; i++) {
        for (int j = 1;j < 36; j++){
            if (j % 5 == 0){
                continue;
            }
            System.out.println("给第"+i+"班第"+j+"个同学发了橙子");
            cnt --;
            if (cnt == 0) {
                break cla;
            }
        }
        }
        System.out.println("一共发放了"+(100-cnt)+"个橙子");
    }
}
