package sec01.exam02;

public class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("turnOff");
	}

}
