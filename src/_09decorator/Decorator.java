package _09decorator;

/**
 * @author jehon
 */
public class Decorator extends Drink {

    private Drink drink;

    // 组合，这里就是为了把drink（被修饰）引进来
    Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.getPrice();
    }

    @Override
    public String getDes() {
        return des + " " + getPrice() + " && " + drink.getDes();
    }
}
