package java16_interface;

interface interface2{
	
	void login();
	void logout();
}

interface interface1 extends interface2{  //interface-extends-inheritance
	void search();
	void payment();
}


public class Interf_Ex1 implements interface1 { //class--implements---interface
	void address() {
		
	}
	static void distance() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interf_Ex1 inter= new Interf_Ex1();
		
		inter.login();
		inter.logout();
		inter.search();
		inter.payment();
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("search");
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("payment");
	}

}
