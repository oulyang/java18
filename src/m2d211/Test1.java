package m2d211;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
/*
 * java.io.DataOutputStream:����ר�����������ݺ���������һͬд���ļ������ļ�������ͨ�ı��ĵ��������ü��±��򿪣���
 */
public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\Ӧ��\\����\\te"));
		
		//д����
		byte b=100;
		short s=200;
		int i=300;
		long l=400;
		float f=3.0f;
		double d=3.14;
		boolean bl=true;
		char c='a';
		
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(bl);
		dos.writeChar(c);
		
		dos.flush();
		dos.close();
	}

}
