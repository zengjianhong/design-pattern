package _16visitor;

/**
 * @author jehon
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
