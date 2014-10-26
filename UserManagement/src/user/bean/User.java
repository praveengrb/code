package user.bean;

import java.io.Serializable;

public class User implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -2014859406378628171L;
String name,age,address,welcomemessage,accNumber,accType;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name,String age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public User(String name, String age, String address, String welcomemessage,
			String accNumber, String accType) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.welcomemessage = welcomemessage;
		this.accNumber = accNumber;
		this.accType = accType;
	}
	public final String getAccType() {
		return accType;
	}
	public final void setAccType(String accType) {
		this.accType = accType;
	}
	public final String getAccNumber() {
		return accNumber;
	}
	public final void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getAge() {
		return age;
	}
	public final void setAge(String age) {
		this.age = age;
	}
	public final String getAddress() {
		return address;
	}
	public final void setAddress(String address) {
		this.address = address;
	}
	public final String getWelcomemessage() {
		return welcomemessage;
	}
	public final void setWelcomemessage(String welcomemessage) {
		this.welcomemessage = welcomemessage;
	}
}
