/*
	Demonstrates simple keyboard input
	Program accepts a single character as input at run time
*/
;
public class DemoInput
{
	public static void main (String args[ ]) throws Exception
	{
		char userInput;
		System.out.println("Please enter a character ");
		userInput =   (char)System.in.read(); //read method accepts a byte and returns an integer
		System.out.println("You entered " + userInput);
	}
}

