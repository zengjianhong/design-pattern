package _15command;

/**
 * @author jehon
 */
public class TVOffCommand implements Command {

    // 聚合TVReceiver
    TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
