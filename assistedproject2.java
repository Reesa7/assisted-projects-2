package assistedproject2;

public class ThrowsDemo {
	void Division()throws ArithmeticException{
		int a=45,b=0,rs;
		rs=a/b;
		System.out.println("the result is:"+rs);
	}

	public static void main(String[] args) {
		ThrowsDemo t = new ThrowsDemo();
		try {
			t.Division();
		}
		catch(ArithmeticException Ex) {
			System.out.println("Error : cant divide by zero ");
					
		}
		System.out.println("end of program");

	}

}
