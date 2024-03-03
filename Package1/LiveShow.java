package Package1;

public class LiveShow extends BookMyShow
{
	int price;
	@Override
	public void Search()
	{
		System.out.println("which one you want to watch");
		System.out.println("pree 1 for Music Shows , 2 for Exhibitions");
		int choice = sc.nextInt();
		if(choice==1)
		{
			System.out.println("Specify the language for Music Shows");
			System.out.println("Press 1 for Hindi , 2 for English , 3 for Punjabi");
			int choose = sc.nextInt();
			if(choose==1)
			{
				System.out.println("Select the singer of your preference");
				System.out.println("Press 1 for Arijit Singh , 2 for KK ");
				int singer = sc.nextInt();
				System.out.println("Enjoy your viewing experience of Music Shows!");	
			}
			if(choose==2)
			{
				System.out.println("Select the singer of your preference");
				System.out.println("Press 1 for Dua Lipa , 2 for Taylor Alison Swift");
				int EngSinger = sc.nextInt();
				System.out.println("Enjoy your viewing experience of Music Shows!");
			}
			if(choose==3)
			{
				System.out.println("Select the singer of your preference");
				System.out.println("Press 1 for AP Dhillon , 2 for B Praak");
				int PunSinger = sc.nextInt();
				System.out.println("Enjoy your viewing experience of Music Shows!");
			}
		}
		if(choice==2)
		{
			System.out.println("Enjoy your viewing experience of Exhibitions!");
		}
	}
	
	public void seatSelection()
	{
		System.out.println("Enter the number of seats");
		int numberofseats=sc.nextInt();
		System.out.println("Enter the seat to select");
		System.out.println("1 For Normal ---> 200rs");
		System.out.println("2 for Executive ---> 300rs");
		System.out.println("3 for Premium --> 400rs");
		int selectedseat=sc.nextInt();
		
		if(selectedseat==1)
		{
			price=price + (200*numberofseats);
		}
		if(selectedseat==2)
		{
			price=price + (300*numberofseats);
		}
		if(selectedseat==3)
		{
			price=price + (400*numberofseats);
		}
		System.out.println("Total amount of movie is " +price);
	}
	
	public void addOns()
	{
		System.out.println("Do you want addOns ? press 1 for no , 2 for yes");
		int addOn=sc.nextInt();
		if(addOn==1)
		{
			System.out.println("Total price is " +price);
		}
		
		if(addOn==2)
		{
			System.out.println("Enter the addOns");
			System.out.println("1 for Small -->150rs");
			System.out.println("2 for Large -->300rs");
			int choice=sc.nextInt();
			System.out.println("Enter the number of addOns");
			int numberofaddOns=sc.nextInt();
			if(choice==1)
			{
				price=price + (150*numberofaddOns);
				System.out.println("Total amount is " +price);
			}
			if(choice==2)
			{
				price=price + (300*numberofaddOns);
				System.out.println("Total amount is " +price);
			}
		}
	}
	@Override
	public void bookTickets()
	{
		Search();
		seatSelection();
		addOns();
	}
	
	public void CancelTicket()
	{
		System.out.println("Do you really want to cancel a ticket ? yes or no");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.println("Ticket has been Cancelled");
			price=0;
			System.out.println("Total amount refunded");
		}
		if(choice.equalsIgnoreCase("no"))
		{
			System.out.println("Enjoy the movie");
		}
	}
}
