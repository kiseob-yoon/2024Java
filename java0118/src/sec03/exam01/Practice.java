package sec03.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String>array = new ArrayList<>();
		
		System.out.println("값을 입력하세요");
		String value = scanner.nextLine();
		array.add(value);
		
		for(String ar:array) {
			System.out.println(ar);
		}
	}

}
