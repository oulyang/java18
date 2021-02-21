package m2d212;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
		public static void log(String msg) {
			try {
				PrintStream ps=new PrintStream(new FileOutputStream("D:\\”¶”√\\ª¢—¿\\tes",true));
				System.setOut(ps);
				
				Date nowTime=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
				String strTime=sdf.format(nowTime);
				
				System.out.println(strTime+" "+msg);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
