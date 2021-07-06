package _07adapter.classadapter;

/**
 * @author jehon
 *
 * 类适配器模式
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
