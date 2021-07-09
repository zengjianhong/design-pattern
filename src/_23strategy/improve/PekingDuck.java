package _23strategy.improve;

/**
 * @author jehon
 */
public class PekingDuck extends Duck {

    // 加入北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
       flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~~北京鸭~~~");
    }
}
