package Assignment;

public class MKT_Sp_Assignment_8 
{
	static int a = 25;
	static int b = 20;
	
	static void sum() 
{
	int a = 20; // updating value(if we use int in front of a mean its only update value within this method )
	int sum = a+b;
	System.out.println(sum);
}
	void sub() 
{
	a = 20; //(if we not use int in front of a mean now its update value of a in every upcoming code)
	int sub = a-b; 
	System.out.println(sub);
}
	public static void main(String[] args) 
	{
		sum();
		MKT_Sp_Assignment_8 a1 = new MKT_Sp_Assignment_8 ();
		a1.sub();

	}

}
