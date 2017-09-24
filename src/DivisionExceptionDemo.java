import java.util.Scanner;

public class DivisionExceptionDemo {

	public static void main(String[] args) {
		int a,b,c;
		
		System.out.println("enter two numbers");
		Scanner scanner = new Scanner(System.in);
		a= scanner.nextInt();
		b= scanner.nextInt();
		try {
		c=a/b;
		System.out.println("result: "+c);
		} catch (Exception e) {
			System.out.println("zero not allowed");
		}
		
		System.out.println("the end");
	}
	
}
