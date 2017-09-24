package assertions;

public class AssertionDemo {

	public static void main(String[] args) {
		
		int atmBalance= 50;
		int withDrawal= 100;
		
		assert (withDrawal < atmBalance):"withDrawal should be less than balance";
		
	}
	
	
	
	
}
