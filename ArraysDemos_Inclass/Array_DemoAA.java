/*
	Demonstrates the index number and its initial value of an array
	after the array is declared and created
*/
public class Array_DemoA
{
	  static double myArray [ ] = {10, 20, 30, 40, 50};

	public static void main (String args[ ])
	{
		double sum =0;

		//calculating sum of elements in array
		for(int i= 0; i< myArray.length; i++)
			sum = sum + myArray[i];

		System.out.println(" Average of all = " + sum/myArray.length );
	}
}

