package _04factory_interface.simplefactory.pizzastore.pizza;

/**
 * @author jehon
 */
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
