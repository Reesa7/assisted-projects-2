package assistedproject2;

public class Throwdemo {
	
	public static void main(String[] args) {
		int a=45,b=0,rs;
		try {
			if(b==0) 
				throw(new ArithmeticException("cant divide by zero"));
			else
			{
				rs=a/b;
				System.out.println("the result is :"+rs);
			}
		}
		catch(ArithmeticException Ex)
		{
			System.out.println(Ex.getMessage());
		}
        System.out.println("end of program");
	}

}
