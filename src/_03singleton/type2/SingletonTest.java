package _03singleton.type2;

/**
 * @author jehon
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

/**
 * 饿汉式（静态代码块）
 */
class Singleton {

    // 1. 构造器私有化，外部不能new
    private Singleton() {}

    // 2. 本类内部创建对象实例
    private final static Singleton instance;

    static {
        // 在静态代码块总，创建单例对象
        instance = new Singleton();
    }

    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() { return instance; }
}
