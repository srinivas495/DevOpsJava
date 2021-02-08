import java.util.Scanner;

public class Eligibleforvoting {

	public static void main(String[] args) 
	{
		int age;
		
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your tickets :");
	      age = sc.nextInt();
		
		if (age>=18)
			    
			System.out.println("eligible for voting");
		else
			System.out.println("Not eligible for voting");
		
		
	}

}
