package m2d214;

import java.io.Serializable;

public class User implements Serializable {
	public static final long serialVersionUID=12121;
	private int no;
	//private String name;
	
	//transient关键字表示游离的，不参与序列化
	private transient String name;
	public User() {
		super();
	}
	public User(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}
	
}
