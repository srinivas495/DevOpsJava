import java.util.Scanner;

public class LargestOftwoNumbers {

	public static void main(String[] args) {
		int a,b;
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("a :");
		a = num1.nextInt();
		Scanner num2 = new Scanner(System.in);
		System.out.println("b :");
		b = num2.nextInt();
		
		if (a<b)
		System.out.println("b is Largest number: "+b);
		
		else if (a>b)
			System.out.println("a is Largest number: "+a);
		
		else
			System.out.println("both equal ");
	}

}
