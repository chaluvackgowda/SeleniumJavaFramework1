package demo;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Started ");
			int num=1/0;
			System.out.println("Completed");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
