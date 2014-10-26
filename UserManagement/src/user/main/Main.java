package user.main;

import java.io.IOException;
import java.util.Scanner;

import user.bean.User;
import user.business.CurrentAccount;
import user.business.SavingsAccount;
import user.core.Account;
import user.dao.RecordsManager;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your process new or existing");
		String process = in.nextLine();
		if(process.equalsIgnoreCase("new")){
		System.out.println("Enter ur Name");
		String name=in.nextLine();
		System.out.println("Enter ur Age");
		String age=in.nextLine();
		System.out.println("Enter ur Address");
		String address=in.nextLine();
		System.out.println("what type of account u need savings / current");
		String accType =in.nextLine();
		User u = new User(name,age,address);
		Account ac = null ;
		if(accType.equalsIgnoreCase("current")){
			ac=new CurrentAccount();
			u.setAccType("Current");
		} else{
			ac=new SavingsAccount();
			u.setAccType("Savings");
		}
		u.setWelcomemessage(ac.welcomeKit());
		RecordsManager rm = new RecordsManager();
		
		
		try {
			System.out.println(rm.saveRecords(u));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} else{
			
			System.out.println("Enter existing account Name");
			String accountNumber = in.nextLine();
			//RecordsManager rm = new RecordsManager();
			RecordsManager rm = new RecordsManager();
			try {
				User u=rm.retriveRecords(accountNumber);
				System.out.println("Your Details " );
				System.out.println("Your Account Number "+u.getAccNumber());
				System.out.println("Your Account Type "+u.getAccType());
				System.out.println("Your Name "+u.getName());
				System.out.println("Your Age "+u.getAge());
				System.out.println("Your Address " +u.getAddress());
				System.out.println("Your acc details"+u.getWelcomemessage());
			} catch (IOException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		in.close();

	}

}
