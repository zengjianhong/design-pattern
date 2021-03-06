package _04factory_interface.factorymethod.pizzastore.order;

import _04factory_interface.factorymethod.pizzastore.pizza.BJCheesePizza;
import _04factory_interface.factorymethod.pizzastore.pizza.BJPepperPizza;
import _04factory_interface.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author jehon
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
