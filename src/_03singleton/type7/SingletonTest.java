package _03singleton.type7;

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
 * 静态内部类，推荐使用
 */
class Singleton {

    // 1. 构造器私有化，外部不能new
    private Singleton() {}

    // 2. 本类内部创建实例, 且是volatile修饰
    private static volatile Singleton instance;

    // 写一个静态内部类，该类中有一个静态属性，Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3. 提供一个静态的共有方法，直接返回SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
