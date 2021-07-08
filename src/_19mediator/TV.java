package _19mediator;

/**
 * @author jehon
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTv() {
        System.out.println("It's time to start tv!");
    }

    public void stopTv() {
        System.out.println("Stop tv!");
    }
}
