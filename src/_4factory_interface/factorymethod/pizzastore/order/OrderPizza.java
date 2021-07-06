package _4factory_interface.factorymethod.pizzastore.order;

import _4factory_interface.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jehon
 */
public abstract class OrderPizza {

    // 定义一个抽象方法，createPizza, 让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    OrderPizza() {
        Pizza pizza;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType); // 抽象方法，由工厂子类完成
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类：");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
