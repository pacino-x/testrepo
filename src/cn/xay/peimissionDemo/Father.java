package cn.xay.peimissionDemo;
/*
四权限修饰符：private、默认、protected、public
 */
public class Father {
    private void show1(){
        System.out.println("show1 private");
    }

    void show2(){
        System.out.println("show2 默认");
    }

    protected void show3(){
        System.out.println("show3 protected");
    }

    public void show4(){
        System.out.println("show4 public");
    }
}



