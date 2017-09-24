
public class ThrowKeywordDemo {

	public static void main(String[] args) {

		//throw new RuntimeException("invalid data");
		
		try {
			throw new Exception("invalid data");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
