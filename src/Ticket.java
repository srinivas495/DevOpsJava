import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) 
	{
		int Slprice =150;
		int GDprice=200;
		int ticketCount;
		int totalPrice = 0;
		int TC;
		  Scanner sc = new Scanner(System.in);
	      System.out.println("No of tickets :");
	      ticketCount = sc.nextInt();
	   	   
	      Scanner TP = new Scanner(System.in);
	      System.out.println("Type of Tickets");
	      TC = TP.nextInt();
	      
	    
		
		if (TC == 0) 
	      {
	    	        
	      totalPrice = ticketCount *Slprice;
	      System.out.println("SL tickets price :" + totalPrice );
	      }
	     else if (TC == 1)
	      {
	      totalPrice = ticketCount *GDprice;
	      System.out.println("GD tickets price :" + totalPrice );
	      }
	      
	      
	     else
	     {
	    	 System.out.println("NO");
	     }
	}

}
