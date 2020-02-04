/*
	Demonstrates simple keyboard input
	Program accepts a single character as input at run time
*/

public class DemoInput_2
{
	public static void main (String args[ ]) throws Exception
	{
		char userResponse;

		System.out.println("Do you want to see the value of somevariable ");
		System.out.println("Enter Y for yes or N for no");

		userResponse = (char)System.in.read(); //read method accepts a byte and returns an integer
		if(userResponse == 'Y' || userResponse == 'y')
			System.out.println("The value of someVariable is " + userResponse );
	}
}

