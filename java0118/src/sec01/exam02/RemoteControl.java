package sec01.exam02;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10; //전부 적은 것
	int MIN_VOLUME = 0; //축약형(인터페이스를 사용하면 축약이 가능하다)
	int x = 100; //소문자도 상수취급
	
	public abstract void turnOn(); //전부 적은 것 (추상 메서드를 활용하는 것이 목적) 
	void turnOff(); //축약형
	
	//인터페이스는 메서드 반드시 만들어야 하는 것을 정의 해주는 역할
	

}
