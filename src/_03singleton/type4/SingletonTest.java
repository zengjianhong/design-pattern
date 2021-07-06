package _03singleton.type4;

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
 * 懒汉式(线程安全，同步方法，效率不高）
 */
class Singleton {

    // 1. 构造器私有化，外部不能new
    private Singleton() {}

    // 2. 本类内部创建实例
    private static Singleton instance;

    // 3. 提供一个公有的静态方法，内部创建对象实例并返回实例对象
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
