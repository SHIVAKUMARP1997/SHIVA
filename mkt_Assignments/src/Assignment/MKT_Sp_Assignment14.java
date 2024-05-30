package Assignment;
class Filpkart_login
{ void apple()
	{System.out.println("concrete method1");}
	void banana()
	{System.out.println("concrete method2");}
}
abstract class Filpkart_Logout extends Filpkart_login
{abstract void mango(); // abstract method1
	abstract void orange(); // abstract method2
	void carrot()
	{	System.out.println("concrete method3");}
	void dragon()
	{System.out.println("concrete method4");}}
public class MKT_Sp_Assignment14 extends Filpkart_Logout
{
	void pinapple()
	{System.out.println("concrete method5");}
	void grapes()
	{System.out.println("concrete method6");}
	public static void main(String[] args) 
	{MKT_Sp_Assignment14 a1 = new MKT_Sp_Assignment14();
		a1.apple();
		a1.banana();
		a1.carrot();
		a1.dragon();
		a1.pinapple();
		a1.grapes(); a1.mango(); a1.orange(); }
	@Override
	void mango() 
	{System.out.println("abstract method 1 imlement");}
	@Override
	void orange() 
	{System.out.println("abstract method 2 imlement");}
}
