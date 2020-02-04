import java.io.*;

class Junk
{
    public static void main(String args[]) throws Exception
    {
        File directory = new File("D:\\PROG10082_2006");

		String filename[ ] = directory.list();

		for (int i = 0; i < filename.length; i++)
			System.out.println(filename[i]);

  }
}
