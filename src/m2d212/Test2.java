package m2d212;

import java.io.FileOutputStream;
import java.io.PrintStream;

//java.io.PrintStream:标准字节输出流，默认输出到控制台
public class Test2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PrintStream ps=System.out;
		ps.println("hello");
		
		System.out.println("world");
		//标准输出流不需要close关闭
		
		//标准输出流指向ps文件
		PrintStream prs=new PrintStream(new FileOutputStream("D:\\应用\\虎牙\\ps"));
		//修改输出方向
		System.setOut(prs);
		
		
		prs.println("lisan");
		prs.println("sanan");
	}

}
