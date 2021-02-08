
public class DemoFunctions 
{

	public static void main(String[] args) 
	{
		System.out.println("RectAngle    :  "+ RectAnle(50, 10));
		System.out.println("RectPra      :  "+ RectPra(50, 10));
		System.out.println("RectAngle    :  "+ RectAnle(40, 20));
		System.out.println("RectPra      :  "+ RectPra(30, 10));
		

	}
	
	public static int RectAnle(int len,int bre) 
	{
		return len * bre;
	}
	
	public static int RectPra(int len,int bre) 
	{
		return 2* (len + bre);
	}
}
