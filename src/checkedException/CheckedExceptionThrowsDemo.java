package checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		CheckedExceptionThrowsDemo obj = new CheckedExceptionThrowsDemo();
		obj.fileReading();
	}

	void fileReading() throws FileNotFoundException {
		System.out.println("start");
			
		FileInputStream obj = new FileInputStream("");

		System.out.println("end");
	}
}
