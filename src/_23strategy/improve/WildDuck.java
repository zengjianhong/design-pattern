package _23strategy.improve;

/**
 * @author jehon
 */
public class WildDuck extends Duck {

    // 构造器，传入FlyBehavior的对象
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
