//Read data from a file and write to screen
import java.io.*;
public class ReadFileWriteScreen
{
	public static void main(String[] args) throws IOException
	{
		InputStream istream;	//declare InputStream object
		OutputStream ostream;	//declare OutputStream object
		File inFile = new File("data.txt");
		int c;

		istream = new FileInputStream(inFile);	//assignment of System.in object to object
		ostream = System.out;	// object assignment

		try
		{
			while((c = istream.read()) != -1)
			{
				ostream.write(c);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}

		finally
		{
			istream.close();
			ostream.close();
		}
	}
}

