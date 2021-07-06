package _09decorator;

/**
 * @author jehon
 */
public class Milk extends Decorator {

    Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
