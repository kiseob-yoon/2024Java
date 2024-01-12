package chap03;

public class MyEye {

	public static void main(String[] args) {
		while(true) {
			int number= (int)(Math.random()5)+1;
			int number2= (int)(Math.random()5)+1;
			System.out.println("(" + number +"," + number2 + ")");
			if((number+number2)==5)
			break;
		}
		
		
	}

}
