import java.util.Scanner;

public class PositiveORNegative {

	public static void main(String[] args) {
		int testNo;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter No : ");
		testNo = n.nextInt();
		
		if (testNo >0 )
			
			System.out.println("Positive number");
		else if (testNo <0)
			System.out.println("Nagtive number");
		else if (testNo == 0)
			System.out.println("Zero number");

	}

}
