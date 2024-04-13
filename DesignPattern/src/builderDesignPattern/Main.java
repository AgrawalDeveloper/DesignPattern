package builderDesignPattern;

import builderDesignPattern.User.UserBuilder;

public class Main {

	public static void main(String str[])
	{
		User user= new User.UserBuilder()
				.setEmailId("Agrawal@email.com")
				.setName("Mona")
				.setUserid("Mona11").build();
		
		System.out.println(user);
	}
}
