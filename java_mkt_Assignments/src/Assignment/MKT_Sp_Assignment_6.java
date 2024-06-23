package Assignment;
public class MKT_Sp_Assignment_6 
{
	public static void main(String[] args) 
	{
		char gender1= 'm';
		char gender2 = 'f';
		char gender3 = 'c';
		int ticket1 = 100;
		int ticket2= 50;
		int ticket3 = 10;
		if (gender1 == 'm' && ticket1==100)
		{
			System.out.println("male");
		}
		else if (gender2=='f'&& ticket1 <=100)
		{
			System.out.println("female");
		}
		else
		{
			System.out.println("custom");
		}
	}
}
