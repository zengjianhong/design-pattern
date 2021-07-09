package _23strategy;

/**
 * @author jehon
 */
public abstract class Duck {

    public Duck() {}

    // 显示鸭子信息
    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~~");
    }

    public void swim() {
        System.out.println("鸭子会有用~~~");
    }

    public void fly() {
        System.out.println("鸭子会飞翔~~~");
    }
}
