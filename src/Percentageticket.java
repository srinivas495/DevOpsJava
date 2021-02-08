import java.util.Scanner;

public class Percentageticket {

	public static void main(String[] args) 
	{
		int ticketCount;
		int ticketPrice = 400;
		int TotticketPrice ;
		int offerPrice;
		int AfterDiscountFinalPrice;
		  
		  Scanner sc = new Scanner(System.in);
	      System.out.println("No of tickets :");
	      ticketCount = sc.nextInt();
		
		if (ticketCount>=10) 
		{
			
			TotticketPrice =( ticketCount * ticketPrice );
			System.out.println("Total Ticket Price: "+TotticketPrice);
			offerPrice =( TotticketPrice * 10 )/100 ;
			System.out.println("Discount 10 % : "+ offerPrice);
			AfterDiscountFinalPrice = TotticketPrice - offerPrice;
			System.out.println("After Discount 10 %  Total Ticket Price: "+ AfterDiscountFinalPrice);
		}
			
		else if(ticketCount>=5) 
		{
			TotticketPrice = ticketCount * ticketPrice;
			System.out.println("Total Ticket Price: "+TotticketPrice);
			offerPrice =( TotticketPrice * 5 )/100 ;
			System.out.println("Discount 5 % : "+ offerPrice);
			AfterDiscountFinalPrice = TotticketPrice - offerPrice;
			System.out.println("After Discount 5 %  Total Ticket Price: "+ AfterDiscountFinalPrice);
		}
		
		else if(ticketCount>=1) 
		{
			TotticketPrice = ticketCount * ticketPrice;
			System.out.println("Total Ticket Price: "+TotticketPrice);
		}

		else 
		{
			System.out.println("Invalid Ticket Count ");
		}	
			
		
	}

}
