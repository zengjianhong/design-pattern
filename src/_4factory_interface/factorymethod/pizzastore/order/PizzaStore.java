package _4factory_interface.factorymethod.pizzastore.order;

/**
 * @author jehon
 */
public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            new BJOrderPizza();
        } else {
            new LDOrderPizza();
        }
    }
}
