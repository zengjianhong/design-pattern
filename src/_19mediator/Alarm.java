package _19mediator;

/**
 * @author jehon
 *
 * 具体的同时类
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange, this.name);
    }
}
