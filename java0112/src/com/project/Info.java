package com.project;

public class Info {
	boolean run = true;
	private Floor floor = Floor.FLOOR1;
	int count = 0;
	 
	
	public int zero() {
		int x = 0;
		return x;
	}
	
	public void search(Floor floor) {
		if(floor == floor.FLOOR1) {
			System.out.println("1층입니다.");
		} else if(floor == floor.FLOOR2) {
			System.out.println("2층으로 올라갑니다.");
		} else if(floor == floor.FLOOR3) {
			System.out.println("3층으로 올라갑니다.");
		} else if(floor == floor.FLOOR4) {
			System.out.println("4층으로 올라갑니다..");
		} else if(floor == floor.FLOOR5) {
			System.out.println("5층으로 올라갑니다.");
		}
	}
	
	public Info(boolean run, int count) {
		this.run = run;
		this.count = count;
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
}
