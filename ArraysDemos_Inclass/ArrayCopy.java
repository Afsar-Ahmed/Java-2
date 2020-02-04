import java.util.*;

class ArrayCopy
{
	public static void main(String args [ ])
	{
		int[ ] sourceArray = {2, 3, 1, 5, 10};//creating, and loading array

		int[ ] targetArray = new int[sourceArray.length];	//Creating 5 elements long array

	System.arraycopy(sourceArray, 0, targetArray, 0,sourceArray.length);
	//	for (int i = 0; i < sourceArray.length; i++)
	//	   targetArray[i] = sourceArray[i];

		Arrays.sort(sourceArray);
		Arrays.sort(targetArray);

		int j = Arrays.binarySearch(sourceArray, 4);
		System.out.println("j ="  + j );

		for (int i = 0; i < sourceArray.length; i++)
		   System.out.println(sourceArray[i] + "\t\t" + targetArray[i]);
	}

}


