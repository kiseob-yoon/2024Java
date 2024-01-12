package com.project;

import java.util.Scanner;

public class InfoMain {
	
	static Scanner scanner = new Scanner(System.in); 

	public static void main(String[] args) {
		Info info = new Info(true,10);
//		while(info.isRun()) {
//			if(info.zero() == 1) {
//				System.out.println("같다");
//				else {
//					System.out.println("같지 않다");
//				}
//			}
//		}

		while(info.isRun()) {
			System.out.print("층을 선택하세요> ");
			int floorNum = Integer.parseInt(scanner.nextLine());
			switch(floorNum) {
			case 1:
				info.search(Floor.FLOOR1);
				break;
			case 2:
				info.search(Floor.FLOOR2);
				break;
			case 3:
				info.search(Floor.FLOOR3);
				break;
			case 4:
				info.search(Floor.FLOOR4);
				break;
			case 5:
				info.search(Floor.FLOOR5);
				break;
				
			}
			
		}
		

	}

}
