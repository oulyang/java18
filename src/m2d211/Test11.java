package m2d211;

import java.io.DataInputStream;
import java.io.FileInputStream;

//��д˳��Ҫһ��
public class Test11 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	DataInputStream dis=new DataInputStream(new FileInputStream("D:\\Ӧ��\\����\\te"));
	
	//������
	byte b=dis.readByte();
	short s=dis.readShort();
	int i=dis.readInt();
	long l=dis.readLong();
	float f=dis.readFloat();
	double d=dis.readDouble();
	boolean bl=dis.readBoolean();
	char c=dis.readChar();
	
	System.out.println(b);
	System.out.println(s);
	dis.close();
	}

}
