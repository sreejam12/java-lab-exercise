package files;

import java.io.*;

public class FileEx5 {

	public static void main(String[] args) {
		String path="C:\\\\Users\\\\Vishal Chikatwar\\\\eclipse-workspace\\\\FJWP";
		File ob=new File(path);
		String dir[]=ob.list();
		for(int i=0;i<dir.length;i++)
		{
			System.out.println(dir[i]);
		}

	}

}
