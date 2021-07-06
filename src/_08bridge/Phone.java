package _08bridge;

/**
 * @author jehon
 */
public abstract class Phone {

    // 组合品牌
    private Brand brand;

    Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() { this.brand.open(); }

    protected void close() { this.brand.close(); }

    protected void call() { this.brand.call(); }
}
