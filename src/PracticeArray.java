
public class PracticeArray 
{

	public static void main(String[] args) 
	{
//		int a [] = {1,2,3,4,5};
//		int i;
//		
//		for(i=0;i<5;i++) 
//		{
//			System.out.println(a[i]);
//		}
//		

		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int i,j;
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		
	}

}
