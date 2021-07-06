package _08bridge;

/**
 * @author jehon
 *
 * 折叠式手机，继承抽象类Phone
 */
public class FoldedPhone extends Phone {

    FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 折叠式手机开机 ");
    }

    public void close() {
        super.close();
        System.out.println(" 折叠样式手机关机 ");
    }

    public void call() {
        super.call();
        System.out.println(" 折叠样式手机打电话 ");
    }
}
