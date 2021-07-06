package _04factory_interface.factorymethod.pizzastore.pizza;

/**
 * @author jehon
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒Pizza");
        System.out.println(" 北京的胡椒pizza,准备原材料 ");
    }
}
