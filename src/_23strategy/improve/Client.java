package _23strategy.improve;

/**
 * @author jehon
 *
 * 策略模式
 */
public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        // 动态改变某个对象的行为，北京鸭不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("北京鸭的设计飞翔能力");
        pekingDuck.fly();
    }
}
