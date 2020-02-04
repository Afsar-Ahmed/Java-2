//Creating a program that writes keyboard data to a file
import java.io.*;

public class ReadKBWriteFile
{
	public static void main(String[] args) throws IOException
	{
		InputStream istream;	//declare InputStream object
		OutputStream ostream;	//declare OutputStream object

		File outFile = new File("Datafile.dat");
		int c;

		istream = System.in;	//assignment of System.in object to object
		ostream = new FileOutputStream(outFile, true);

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

