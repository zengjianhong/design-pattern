package _04factory_interface.absfactory.pizzastore.pizza;

/**
 * @author jehon
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪Pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
