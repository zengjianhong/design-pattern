package _4factory_interface.absfactory.pizzastore.order;

/**
 * @author jehon
 */
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza(new BJFactory());

        new OrderPizza(new LDFactory());
    }
}
