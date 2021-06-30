import java.util.*;
class NotASquareException extends Exception
{
	NotASquareException()
	{
		System.out.println("Not a square");
	}
}
public class Shape {
	int length,width;
	boolean isSquare() throws NotASquareException {
		if(length==width)
		{
			return true;
		}
		else
		{
			throw new NotASquareException();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of a Shape: ");
		Shape S=new Shape();
		S.length=sc.nextInt();
		System.out.println("Enter width of a Shape: ");
		S.width=sc.nextInt();
		try{
			if(S.isSquare())
			{
				System.out.println("It is sqaure.");
			}
		}
		catch(NotASquareException e)
		{
		}
	}
}
