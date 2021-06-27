package _19mediator.smarthouse;

public class TV extends Colleague {

	TV(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void StartTv() {
		System.out.println("It's time to StartTv!");
	}

	public void StopTv() {
		System.out.println("StopTv!");
	}
}
