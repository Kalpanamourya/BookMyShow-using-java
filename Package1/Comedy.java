package Package1;

public class Comedy extends BookMyShow
{
	int price;

    @Override
    public void Search() 
    {
        System.out.println("Take Your Pick - Your Laughter, Your Choice");
        System.out.println("Press 1 for Stand-Up, 2 for Shows");
        int choice = sc.nextInt();
        if (choice == 1) 
        {
            System.out.println("Which Stand-Up Comedian Would You Like to Enjoy?");
            System.out.println("Press 1 for Munawar, 2 for Harsh");
            int choosecomedian = sc.nextInt();
            System.out.println("Enjoy Your Watching! Get Ready for Some Good Laughs");
        }
        if (choice == 2) 
        {
            System.out.println("Which Show would you Like to Enjoy?");
            System.out.println("Press 1 for Zakir, 2 for Bassi");
            int chooseshow = sc.nextInt();
            System.out.println("Enjoy Your Watching! Get Ready for Some Good Laughs");
        }
    }

    public void seatSelection() 
    {
        System.out.println("Number of Seats");
        int numberofseat = sc.nextInt();

        if (numberofseat == 1) 
        {
            price = 500; // Set the price for one seat
            System.out.println("Total amount of Comedy show is " + price);
        } 
        else if (numberofseat == 2) 
        {
            System.out.println("Enter the seat to select for show:");
            System.out.println("1 for Near to Stage ------> 5000");
            System.out.println("2 for Middle seat ------> 3000");
            System.out.println("3 for Back seat ------> 1500");
            int selectseat = sc.nextInt();
            
            if(selectseat == 1) 
            {
                price = price+ (5000 * numberofseat);
            } 
            else if(selectseat == 2) 
            {
                price = price + (3000 * numberofseat);
            } 
            else if(selectseat == 3) 
            {
                price =price + (1500 * numberofseat);
            }
            
            System.out.println("Total amount for Comedy show is " + price);
        }
    }

    public void addOns() 
    {
        System.out.println("Would You Like to AddOns to Enhance Your Experience?");
        System.out.println("Press 1 for yes, 2 for no");
        int addOns = sc.nextInt();
        if (addOns == 1) 
        {
            System.out.println("Which one do you want? Press 1 for Popcorn, 2 for Drinks");
            int chooseaddOns = sc.nextInt();
            if(chooseaddOns == 1) 
            {
                System.out.println("1 for Small --> 150rs");
                System.out.println("2 for Large --> 300rs");
                int choice = sc.nextInt();
                System.out.println("Enter the number of addOns");
                int numberofaddOns = sc.nextInt();
                
                if(choice == 1) 
                {
                    price = price + (150 * numberofaddOns);
                } else if (choice == 2) {
                    price = price + (300 * numberofaddOns);
                }
                
                System.out.println("Total amount is " + price);
            } 
            else if(chooseaddOns == 2) 
            {
                System.out.println("1 for Coca cola --> 200rs");
                System.out.println("2 for Soju --> 750rs");
                int choice = sc.nextInt();
                System.out.println("Enter the number of Drinks");
                int numberofaddOns = sc.nextInt();
                
                if(choice == 1) 
                {
                    price = price + (200 * numberofaddOns);
                } 
                else if(choice == 2) 
                {
                    price = price + (750 * numberofaddOns);
                }
                
                System.out.println("Total amount is " + price);
            }
        } 
        else 
        {
            System.out.println("Enjoy the Show");
        }
    }

    @Override
    public void bookTickets() {
        Search();
        seatSelection();
        addOns(); 
    }

    public void CancelTicket() {
        System.out.println("Do you really want to cancel a ticket? yes or no");
        String choice = sc.next();
        
        if (choice.equalsIgnoreCase("yes")) {
            int cancelledAmount = price;
            double taxRate = 10.00;
            double taxamount = (cancelledAmount * taxRate) / 100;
            
            System.out.println("Cancelled Amount: " + cancelledAmount);
            System.out.println("Tax Rate: " + taxRate + "%");
            System.out.println("Tax Amount: " + taxamount);
            System.out.println("Ticket has been Cancelled; tax will be charged");
            System.out.println("Total amount refunded");
        } else {
            System.out.println("Enjoy the Comedy Show");
        }
    }

}
