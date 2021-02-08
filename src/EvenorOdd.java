import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) 
	{
		int testNo;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter No : ");
		testNo = n.nextInt();
		
		if ((testNo/2)*2 ==testNo )
			
			System.out.println("Even number");
		else if ((testNo/2)*2 !=testNo)
			System.out.println("Odd number");
		else 
			System.out.println("Invalid number");

	}

}
