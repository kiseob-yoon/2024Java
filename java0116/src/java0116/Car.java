package java0116;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	
	public int getSpeed() { //값을 읽을 떄
		return speed;
	}
	public void setSpeed(int speed) { //값을 변경할 떄
		if(speed < 0) {
		this.speed = 0; //스피드 마이너스로 안되게 설정
		return;
		} else {
			this.speed = speed; //스피드가 0보다 크면 스피드 그대로 받음
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) { //멈추면 스피드 0
		this.stop = stop;
		this.speed = 0;
	}
	
	

}
