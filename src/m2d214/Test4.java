package m2d214;
/**
 * 参与序列化与反序列化的对象必须实现Serializable接口
 * Serializable接口是一个标志接口，里面没有任何方法，
 * 		其作用是当java虚拟机看见某个类实现该接口后，可能会对其进行特殊待遇（生成序列化版本号，当源代码改动后，反序列化会失败）
 * 
 * java中依靠类名和序列化版本号来区分不同的类。
 * 自动生成序列化版本号优点：区分类
 * 					  缺点：无法修改源码
 * 
 * 凡是一个类实现Serializable接口，建议手动给该类提供一个固定不变的序列化版本号
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\应用\\虎牙\\usertest"));
		
		List<User> userList=new ArrayList<>();
		userList.add(new User(12,"san"));
		userList.add(new User(23,"si"));
		userList.add(new User(34,"wu"));
		
		//序列化集合
		oos.writeObject(userList);
		
		//反序列
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\应用\\虎牙\\usertest"));
		userList=(List<User>)ois.readObject();
		for(User user:userList) {
			System.out.println(user);
		}
		
		
		oos.flush();
		oos.close();
	}

}
