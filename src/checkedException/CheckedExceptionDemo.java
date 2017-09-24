package checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("start");
		try {
			FileInputStream obj = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}

		System.out.println("end");
	}
}
