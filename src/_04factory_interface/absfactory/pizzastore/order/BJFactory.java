package _04factory_interface.absfactory.pizzastore.order;

import _04factory_interface.absfactory.pizzastore.pizza.BJCheesePizza;
import _04factory_interface.absfactory.pizzastore.pizza.BJPepperPizza;
import _04factory_interface.absfactory.pizzastore.pizza.Pizza;

/**
 * @author jehon
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
