package m2d212;

import java.io.FileOutputStream;
import java.io.PrintStream;

//java.io.PrintStream:��׼�ֽ��������Ĭ�����������̨
public class Test2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PrintStream ps=System.out;
		ps.println("hello");
		
		System.out.println("world");
		//��׼���������Ҫclose�ر�
		
		//��׼�����ָ��ps�ļ�
		PrintStream prs=new PrintStream(new FileOutputStream("D:\\Ӧ��\\����\\ps"));
		//�޸��������
		System.setOut(prs);
		
		
		prs.println("lisan");
		prs.println("sanan");
	}

}
