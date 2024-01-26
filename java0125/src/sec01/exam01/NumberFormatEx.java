package sec01.exam01;

public class NumberFormatEx {

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt("ad");
			System.out.println(x);
		} catch(NumberFormatException e){
			e.printStackTrace();
			System.out.println("에러");
		}


	}

}

