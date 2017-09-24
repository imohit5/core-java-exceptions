package customExceptions;

public class CustomExceptionTest {

	public static void main(String[] args) {
		//throw new CustomExecptionUnCheckedDemo("Invalid Data");
		try {
			throw new CustomExecptionCheckedDemo("Invalid Data");
		} catch (CustomExecptionCheckedDemo e) {
			e.printStackTrace();
		}
	}

}
