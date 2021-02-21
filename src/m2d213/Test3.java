package m2d213;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * File类无法完成文件的读写
 * File对象是文件和目录的抽象表示形式，File可能是目录，也可能是文件
 * 
 * File类常用方法
 * 
 * @author yyds
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("D:\\应用\\虎牙");
		System.out.println(f1.exists());
		
		//f1.createNewFile();以文件的形式创建
		//f1.mkdir();以目录的形式创建（mkdirs()可多重目录下创建）
		
		//f1.getName()获取文件名
		
		//获取父路径
		System.out.println(f1.getParent());
		
		System.out.println(f1.getParentFile().getAbsolutePath());
		
		//获取最后一次修改时间
		long time=f1.lastModified();
		Date data=new Date(time);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String str=sdf.format(data);
		System.out.println(str);
		
		//获取文件大小f1.length()
		
		//获取目录下的子文件
		File[] files=f1.listFiles();
		for(File file:files) {
			System.out.println(file.getName());
		}
	}

}
