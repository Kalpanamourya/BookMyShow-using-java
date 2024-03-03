package Package1;
import java.util.Scanner;
public class test 
{
	static 
    {
        System.out.println("Welcome to BookMyShow");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BookMyShow b = new BookMyShow();
        b.SignUp();
        
        if (b.islogin) 
        {
            b.Search();
            if (b.selection == 1) 
            {
                Movies m = new Movies();
                m.bookTickets();
                System.out.println("Do you want to cancel the ticket? yes or no");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("yes")) 
                {
                    m.CancelTicket();
                } 
                else 
                {
                    System.out.println("Enjoy your Movie!");
                }
            } 
            else if (b.selection == 2) 
            {
                Comedy c = new Comedy();
                c.bookTickets();
                System.out.println("Do you want to cancel the ticket? yes or no");
                String choices = sc.next();
                if (choices.equalsIgnoreCase("yes")) 
                {
                    c.CancelTicket();
                } 
                else 
                {
                    System.out.println("Enjoy your Show!");
                }
            } 
            else if(b.selection==3)
            {
            	LiveShow ls = new LiveShow();
            	ls.bookTickets();
            	System.out.println("Do you want to cancel the ticket? yes or no");
                String choices = sc.next();
                if (choices.equalsIgnoreCase("yes")) 
                {
                    ls.CancelTicket();
                } 
                else 
                {
                    System.out.println("Enjoy your Show!");
                }
            }
            else 
            {
                System.out.println("Invalid Selection");
            }
        } 
        else 
        {
            System.out.println("Invalid Password");
        }
    }
}
