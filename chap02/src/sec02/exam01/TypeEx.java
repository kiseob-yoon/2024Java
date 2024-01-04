package sec02.exam01;

public class TypeEx {
	public static void main(String [] args) {
		String str3 = "3.14";
		double value = Double.parseDouble(str3); //double형태로 바꾼다
		
		String str2 = "" + 10 + 2;
		System.out.println(str2);
		int num1 = Integer.parseInt(str2); //정수로 만들기
		
		String str = 10 + 2 + "";
		System.out.println(str);
		
		String str1 = String.valueOf(10+2);
		
		System.out.println(1/2.0);
		
		byte var1 = 100;
		int var2 = 130;
		long var3 = 100000000L;
		float var4 = var3;
		System.out.println(var4);
		
		var1 = (byte) var2;
		System.out.println(var1);
	}
}
