package _04factory_interface.absfactory.pizzastore.order;

import _04factory_interface.absfactory.pizzastore.pizza.Pizza;

/**
 * @author jehon
 *
 * 一个抽象工厂模式的抽象层（接口）
 */
public interface AbsFactory {

    // 让下面的工厂子类具体实现
    Pizza createPizza(String orderType);
}
