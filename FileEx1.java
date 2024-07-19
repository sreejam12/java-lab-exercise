package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx1 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
		fis = new FileInputStream("C:\\Users\\Vishal Chikatwar\\eclipse-workspace\\FJWP\\input.txt");
		int data = fis.read(); // Read a single byte
		fos = new FileOutputStream("C:\\Users\\Vishal Chikatwar\\eclipse-workspace\\FJWP\\output.txt");
		while (data!=-1) {
		fos.write(data); // Write a single byte
		data=fis.read();
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				fos.close();
				fis.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getLocalizedMessage());
			}
			
		}
		System.out.println("File copied successfully");

	}

}


