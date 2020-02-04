//write a class that examine a file and prints appropriate messages
// concerning its status.
import java.io.*;
public class CheckFile
{
	public static void main(String[] args)
	{
		File f = new File("data.txt");

		if(f.exists())
		{
			System.out.println(f.getName() + " exists");
			System.out.println("The file is " + f.length() + "bytes long");

			if(f.canRead())
				System.out.println( " ok to read");

			if (f.canWrite())
				System.out.println( " ok to write");
		}
		else
			System.out.println("file does not exist");
	}
}

