package mc.sn.vo;

public class LoginVO {
	private String id;
	private String pwd;
	
	public LoginVO(){
		System.out.println("������");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
