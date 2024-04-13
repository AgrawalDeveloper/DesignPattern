package builderDesignPattern;

public class User {
	
	private final String name;
	private final String emailId;
	private final String userid;
	
	
	
	public User(UserBuilder userBuilder) {
		// TODO Auto-generated constructor stub
		this.name=userBuilder.name;
		this.emailId=userBuilder.emailId;
		this.userid=userBuilder.userid;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", emailId=" + emailId + ", userid=" + userid + "]";
	}

public static class UserBuilder
{
	private  String emailId;
	private  String name;
	private  String userid;
	
	public UserBuilder()
	{
		System.out.println("Hello, I am UserBuilder!");
	}
	public UserBuilder setEmailId(String emailId) {
		this.emailId = emailId;
		return this;
	}
	public UserBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public UserBuilder setUserid(String userid) {
		this.userid = userid;
		return this;
	}
	
	public User build()
	{
		return new User(this);
	}
	
	
}
	
	
	
}
