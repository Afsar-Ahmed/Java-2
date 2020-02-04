import javax.swing.*;

public class Array_DemoAAA
{
	private static int size = 12;

	public static void main (String args[ ])
	{
		 double myList [ ] = new double [size ];

		//Loading array with user input
		for(int i= 0; i < myList.length; i++)
		{
			String input = JOptionPane.showInputDialog("Enter a value for rainfall");
			double d = Double.parseDouble(input);
			myList[i] = d;
		}

		double sum  = 0;
		//Processing array to calculate average rainfall
		for(int i= 0; i < myList.length; i++)
			sum = sum + myList[i];

		double average = sum/myList.length;

		//Displaying result
		System.out.println("Average Rainfall = " + average);
	}
}

