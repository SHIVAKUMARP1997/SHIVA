package java15_Abstract_And_Concrete_Class;


abstract class Amazon_Auth{
	
	abstract void basic_auth();
	abstract void shiva();
	void login() {
		System.out.println("i am inside the abstract class");
	}
	
}

abstract class Amazon_Login extends Amazon_Auth
{
	abstract void email();
	abstract void mobile();
	void login() {
		System.out.println("i am inside the abstract class");
	}
}

public class Abstract_Example2 extends Amazon_Login {

	public static void main(String[] args) {
		
		Abstract_Example2 Ab = new Abstract_Example2();
		
		Ab.basic_auth();
		Ab.email();
		Ab.mobile();
		Ab.shiva();
		
		
		// TODO Auto-generated method stub

	}

	@Override
	void basic_auth() {
		// TODO Auto-generated method stub
		System.out.println("I am basic_Auth");
	}

	@Override
	void shiva() {
		// TODO Auto-generated method stub
		System.out.println("i am shiva");
	}

	@Override
	void email() {
		// TODO Auto-generated method stub
		System.out.println("i am email");
	}

	@Override
	void mobile() {
		// TODO Auto-generated method stub
		System.out.println("I am mobile ");
	}

}
