package Package1;

import java.util.Scanner;

public class BookMyShow 
{
	String Emailid,pwd;
	Scanner sc=new Scanner(System.in);
	boolean islogin;
	int selection;
		
	public void SignUp()
	{
		System.out.println("Do you have any account ? 1--> no , 2-->yes");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Create an Account");
			System.out.println("Enter your Email Id");
			Emailid=sc.next();
			System.out.println("Enter your password");
			pwd=sc.next();
			login();
		}
		else if(choice==2)
		{
			System.out.println("Login to your Account");
			login();
		}
	}
	
	public void login()
	{
		System.out.println("Enter login Details");
		System.out.println("Enter your Email Id");
		String loginemail=sc.next();
		System.out.println("Enter your Password");
		String loginpwd=sc.next();
		
		if(loginemail.equals(Emailid) && loginpwd.equals(pwd))
		{
			System.out.println("Login Successfully");
			islogin=true;
		}
		else
		{
			System.out.println("Incorrect password");
			islogin=false;
		}
	}
	
	public void Search()
	{
		System.out.println("Enter the choice");
		System.out.println("press 1 for moives , 2 for Comedy , 3 for Live shows");
		selection=sc.nextInt();
	}
	
	public void bookTickets()
	{
		System.out.println("Ticket is being booked");
	}
	public void CancelTicket()
	{
		System.out.println("Ticket is being Cancelled");
	}

	
}
