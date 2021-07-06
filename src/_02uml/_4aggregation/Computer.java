package _02uml._4aggregation;

/**
 * @author jehon
 */
public class Computer {

    // 鼠标可以和computer分离
    private Mouse mouse;

    // 显示器可以和computer分离
    private Moniter moniter;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}
