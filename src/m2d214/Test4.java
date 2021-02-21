package m2d214;
/**
 * �������л��뷴���л��Ķ������ʵ��Serializable�ӿ�
 * Serializable�ӿ���һ����־�ӿڣ�����û���κη�����
 * 		�������ǵ�java���������ĳ����ʵ�ָýӿں󣬿��ܻ�����������������������л��汾�ţ���Դ����Ķ��󣬷����л���ʧ�ܣ�
 * 
 * java���������������л��汾�������ֲ�ͬ���ࡣ
 * �Զ��������л��汾���ŵ㣺������
 * 					  ȱ�㣺�޷��޸�Դ��
 * 
 * ����һ����ʵ��Serializable�ӿڣ������ֶ��������ṩһ���̶���������л��汾��
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
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Ӧ��\\����\\usertest"));
		
		List<User> userList=new ArrayList<>();
		userList.add(new User(12,"san"));
		userList.add(new User(23,"si"));
		userList.add(new User(34,"wu"));
		
		//���л�����
		oos.writeObject(userList);
		
		//������
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Ӧ��\\����\\usertest"));
		userList=(List<User>)ois.readObject();
		for(User user:userList) {
			System.out.println(user);
		}
		
		
		oos.flush();
		oos.close();
	}

}
