package _07adapter.objectadapter;

/**
 * @author jehon
 *
 * 对象适配器模式
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
