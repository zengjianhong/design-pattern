package _08bridge;

/**
 * @author jehon
 *
 * 桥接模式
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
    }
}
