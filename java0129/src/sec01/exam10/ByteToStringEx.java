package sec01.exam10;

public class ByteToStringEx {

	public static void main(String[] args) {
		String sub = "자바 프로그램";
		System.out.println(sub.charAt(3));
		
		byte[]bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str = new String(bytes);
		System.out.println(str);
		
		String str1 = new String(bytes,6,4);
		System.out.println(str1);
		
		char [] chars = {'H', 'e', 'l', 'l', 'o'};
		str = new String(chars);
		System.out.println(str);
	}

}
