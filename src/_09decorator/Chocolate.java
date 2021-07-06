package _09decorator;

/**
 * @author jehon
 *
 * 具体的Decorator, 这里就是调味品
 */
public class Chocolate extends Decorator {

    Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
