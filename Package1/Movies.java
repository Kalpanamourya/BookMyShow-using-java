package Package1;
public class Movies extends BookMyShow
{
	int price;
	@Override
	public void Search()
	{
		System.out.println("Enter the language you want to watch");
		System.out.println("pree 1 for Hindi , 2 for English ");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the movie to watch in hindi");
			System.out.println("Jawan, Gadar 2 , Genius");
			String movieSelection=sc.next();
			System.out.println("Enjoy watching the movie " +movieSelection);
		}
		if(choice==2)
		{
			System.out.println("Enter the movie to watch in English");
			System.out.println("Spider-man, Avengers, The Nun 2");
			String movieSelection=sc.next();
			System.out.println("Enjoy watching the movie " +movieSelection);
	
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
