import java.util.Scanner;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		try {
			System.out.println("start");
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("result: " + arr[i]);
			}
		} catch (Exception e) {
			System.out.println("array length caused error");
		}

		System.out.println("the end");
	}

	void testMethod() {
		System.out.println("testMethod");
	}

}
