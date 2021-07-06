package _09decorator;

/**
 * @author jehon
 */
public class Soy extends Decorator {

    Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
