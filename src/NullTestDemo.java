
public class NullTestDemo {

	static ArrayIndexExceptionDemo obj;
	
	public static void main(String[] args) {
		
		System.out.println("the start");
		try {
			NullTestDemo.obj.testMethod();
		} catch (Exception e) {
			System.out.println("null exception occured");
		}
		System.out.println("the end");
	}

}
