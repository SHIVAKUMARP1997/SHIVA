package Assignment;

public class MKT_Sp_Assignment_4 
{
	void Calling()
	{
	System.out.println("calling non static method");
	}
	static void Calling1()
	{
	System.out.println("calling static method");
	}

	public static void main(String[] args)
	{
		Calling1();
		MKT_Sp_Assignment_4 a1 = new MKT_Sp_Assignment_4();
		a1.Calling();
		
	}

}
