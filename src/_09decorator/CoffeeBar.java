package _09decorator;

/**
 * @author jehon
 *
 * 装饰者模式
 */
public class CoffeeBar {

    public static void main(String[] args) {
        // 装饰者模式下的订单：2份千克力+1份牛奶的LongBlack
        Drink drink = new LongBlack();
        System.out.println("费用1=" + drink.getPrice());
        System.out.println("描述=" + drink.getDes());

        drink = new Milk(drink);
        System.out.println("drink 加入一份牛奶 加入一份巧克力  费用 =" + drink.cost());
        System.out.println("drink 加入一份牛奶 加入一份巧克力 描述 = " + drink.getDes());

        drink = new Chocolate(drink);
        System.out.println("drink 加入一份牛奶 加入2份巧克力   费用 =" + drink.cost());
        System.out.println("drink 加入一份牛奶 加入2份巧克力 描述 = " + drink.getDes());

        System.out.println("===========================");

        Drink order = new DeCaf();
        System.out.println("order 无因咖啡  费用 =" + order.cost());
        System.out.println("order 无因咖啡 描述 = " + order.getDes());

        order = new Milk(order);
        System.out.println("order 无因咖啡 加入一份牛奶  费用 =" + order.cost());
        System.out.println("order 无因咖啡 加入一份牛奶 描述 = " + order.getDes());
    }
}
