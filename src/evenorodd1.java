import java.util.Scanner;

public class evenorodd1 {

	public static void main(String[] args) 
	{
		int a;
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Value : ");
		a = num.nextInt();
		
		if (a % 2 ==0) 
		{
			System.out.println("Even Value ");
		}
		
		else 
		{
			System.out.println("Odd Value ");
		}
	}

}
