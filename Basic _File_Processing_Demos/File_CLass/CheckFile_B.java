//compareing two data files for its size and time.
import java.io.*;
public class CheckFile_B
{
	public static void main(String[] args)
	{
		File f1 = new File("data.txt");
		File f2 = new File("data2.txt");

		if(f1.exists() && f2.exists())
		{
		 	System.out.println("The more recent file is ");

			if(f1.lastModified()>f2.lastModified())
				System.out.println( f1.getName());
			else
				System.out.println(f2.getName());

		System.out.println("The longer file is ");

		if(f1.length() > f2.length())
			System.out.println(f1.getName());
		else
			System.out.println(f2.getName());
		}


	}
}

