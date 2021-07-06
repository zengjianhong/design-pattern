package _02uml._5composition;

/**
 * @author jehon
 */
public class Computer extends Person {

    // 鼠标可以和computer不能分离
    private Mouse mouse = new Mouse();

    // 显示器可以和computer不能分离
    private Moniter moniter = new Moniter();

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}
