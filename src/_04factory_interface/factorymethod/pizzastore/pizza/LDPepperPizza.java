package _04factory_interface.factorymethod.pizzastore.pizza;

/**
 * @author jehon
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦胡椒Pizza");
        System.out.println(" 伦敦的胡椒pizza,准备原材料 ");
    }
}
