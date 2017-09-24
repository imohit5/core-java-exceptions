import java.util.Scanner;

public class StringExceptionDemo {

	public static void main(String[] args) {
		String a="abcdef";
		
		System.out.println("start");
		try {
		int x= Integer.parseInt(a);
		System.out.println("result: "+x);
		} catch (Exception e) {
			System.out.println("cannot convert");
		}
		System.out.println("the end");
	}
	
}
