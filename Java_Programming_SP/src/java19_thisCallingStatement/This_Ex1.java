package java19_thisCallingStatement;


//Try understanding how it is executing.
public class This_Ex1 {
	
	This_Ex1(){
		this(100);
		System.out.println("1");
	}
	
	
	This_Ex1(int a){
		this("Shiva");
		System.out.println("2");
	}
	
	This_Ex1(char a, String name){
		System.out.println("3");
	}
	
	This_Ex1(String sh){
		this('S', "Shiva");
		System.out.println("4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This_Ex1();

	}

}
