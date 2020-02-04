
public class Array_DemoA
{
	  static double myArray [ ] = {10, 20, 30, 40, 50};

	  static double yourArray [ ] = new double [5];

	public static void main (String args[ ])
	{
		yourArray = myArray;

		//Printing myArray
		for(int i= 0; i< myArray.length; i++)
			System.out.println(myArray[i]);

		System.out.println();

		//Printing yourArray
		for(int i= 0; i< yourArray.length; i++)
			System.out.println(yourArray[i]);

	}
}

