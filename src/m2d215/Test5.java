package m2d215;

import java.io.FileReader;
import java.util.Properties;

public class Test5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("D:\\”¶”√\\ª¢—¿\\ttt.property");
		Properties pro=new Properties();
		
		pro.load(fr);
		
		String v1=pro.getProperty("admin");
		System.out.println(v1);
	}

}
