//Creating InputStream and OutputStream objects to read from keyboard
import java.io.*;
public class ReadKBWriteScreen
{
	public static void main(String[] args) throws IOException
	{
		InputStream istream;	//declare InputStream object
		OutputStream ostream;	//declare OutputStream object
		int c;
		istream = System.in;	//assignment of System.in object to object
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

