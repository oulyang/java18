package m2d213;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * File���޷�����ļ��Ķ�д
 * File�������ļ���Ŀ¼�ĳ����ʾ��ʽ��File������Ŀ¼��Ҳ�������ļ�
 * 
 * File�ೣ�÷���
 * 
 * @author yyds
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("D:\\Ӧ��\\����");
		System.out.println(f1.exists());
		
		//f1.createNewFile();���ļ�����ʽ����
		//f1.mkdir();��Ŀ¼����ʽ������mkdirs()�ɶ���Ŀ¼�´�����
		
		//f1.getName()��ȡ�ļ���
		
		//��ȡ��·��
		System.out.println(f1.getParent());
		
		System.out.println(f1.getParentFile().getAbsolutePath());
		
		//��ȡ���һ���޸�ʱ��
		long time=f1.lastModified();
		Date data=new Date(time);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String str=sdf.format(data);
		System.out.println(str);
		
		//��ȡ�ļ���Сf1.length()
		
		//��ȡĿ¼�µ����ļ�
		File[] files=f1.listFiles();
		for(File file:files) {
			System.out.println(file.getName());
		}
	}

}
