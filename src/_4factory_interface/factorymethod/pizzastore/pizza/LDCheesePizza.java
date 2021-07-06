package _4factory_interface.factorymethod.pizzastore.pizza;

/**
 * @author jehon
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的奶酪Pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
