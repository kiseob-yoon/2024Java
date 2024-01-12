package sec04.exam01;

public class AccountEx {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.name = "김하나";
		acc.ssn = "911224";
		acc.tel = "010-1234-1234";
		System.out.println(acc);
		System.out.println(acc.name);
		
		Account acc1 = new Account("김하나", "911224", "010-1234-1234", 25);
		System.out.println(acc1);
	}

}
