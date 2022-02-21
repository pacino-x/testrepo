package cn.xay.Landlord;

import java.util.*;

/*
模拟斗地主发牌：买牌、洗牌、发牌、看牌
 */
public class test {
    public static void main(String[] args) {
        //定义一个双列集合，键表示编号，值表示牌
        Map<Integer,String> pokers = new HashMap<>();
        //定义一个单列集合，存储所有牌的编号
        List <Integer> list1 = new ArrayList<>();
        //具体买牌动作，4种花色，13种点数,手动添加两张大小王,13*4+2=54,每人17张牌
        String[] colors = {"♠","♥","♣","♦"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] card = {};
        int cnt = 0;
        for (int i = 0;i < 13;i++){
            for (int j = 0;j < 4;j++){
                cnt = 4*i + j;
                pokers.put(cnt,colors[j] + number[i]);
                //card. = colors[j] + number[i];这里添加所有牌
                list1.add(cnt);
            }
//            j = 0;//重置一次j，重新开始子循环(不需要这样，进入子循环自动声明j并且重置为0
        }//这样存储所有牌面，格式为花色+点数
        //添加小王
        cnt ++;
        pokers.put(cnt,"小王");
        list1.add(cnt);
        cnt ++;
        pokers.put(cnt,"大王");
        list1.add(cnt);
        //添加大王
        System.out.println("牌面"+pokers);
        System.out.println("编号"+list1);

        //洗牌
        Collections.shuffle(list1);
        System.out.println("洗好的牌编号是："+list1);
        //发牌,创建三个玩家双列集合来存储牌面，循环发放,一个用来存底牌
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> rest = new ArrayList<>();
        int ct = 0;
        System.out.println("list1.size="+list1.size());
        while (ct < list1.size()) {
            if (ct > list1.size() - 4) {
                rest.add(list1.get(ct));
            }

            else if (ct % 3 == 0) {
                player1.add(list1.get(ct));
            }
            else if (ct % 3 ==1) {
                player2.add(list1.get(ct));

            }
            else if ((ct % 3 == 2)){
                player3.add(list1.get(ct));

            }
            ct ++;
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        System.out.println("第一个玩家的手牌是：");
        for (Integer ing1 : player1) {
            System.out.print(pokers.get(ing1));
        }
        System.out.println();
        System.out.print("第二个玩家的手牌是：");
        System.out.println();
        for (Integer ing2 : player2) {
            System.out.print(pokers.get(ing2));

        }
        System.out.println();
        System.out.println("第三个玩家的手牌是：");
        for (Integer ing3 : player3) {
            System.out.print(pokers.get(ing3));
        }
        System.out.println();
        System.out.println("底牌是：");
        for (Integer inr : rest) {
            System.out.print(pokers.get(inr));
        }
    }
}
