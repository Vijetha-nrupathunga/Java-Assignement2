class CustomException extends Exception
{
	CustomException()
	{
		System.out.println("Custom Exception occured.");
	}
}
public class NPExceptionProgram {
	static void method2()
	{
		throw new NullPointerException();
	}
	static void method1() throws CustomException
	{
		try {
				method2();
		}
		catch(NullPointerException e)
		{
			throw new CustomException();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			method1();
		}
		catch(CustomException e) {
			
		}
	}

}
