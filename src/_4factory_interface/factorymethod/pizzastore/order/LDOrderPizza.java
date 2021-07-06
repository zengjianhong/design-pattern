package _4factory_interface.factorymethod.pizzastore.order;

import _4factory_interface.factorymethod.pizzastore.pizza.*;

/**
 * @author jehon
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
