package _19mediator.smarthouse;

public class Curtains extends Colleague {

	Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void upCurtains() {
		System.out.println("I am holding Up Curtains!");
	}

}
