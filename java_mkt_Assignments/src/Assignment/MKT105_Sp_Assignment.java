package Assignment;
class Superclass
{
	static void add()
	{
		System.out.println("super class");
	}
}
public class MKT105_Sp_Assignment extends Superclass
{
	public static void main(String[] args) 
	{
		Superclass converting1	= new MKT105_Sp_Assignment();
		System.out.println("convert upcasting to downcasting");
		MKT105_Sp_Assignment converting2 = (MKT105_Sp_Assignment) converting1; // downcasting only possible when upcasting done
		System.out.println("convert downcasting to upcasting");
		converting2.add();

	}

}
