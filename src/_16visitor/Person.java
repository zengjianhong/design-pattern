package _16visitor;

/**
 * @author jehon
 */
public abstract class Person {

    // 提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
