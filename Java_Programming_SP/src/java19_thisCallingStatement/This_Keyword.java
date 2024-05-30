package java19_thisCallingStatement;

/*
 * 'This' keyword.
 * 		with the help of 'this' Keyword we can assign the local variable value to the global variables.
 *		and we know what is local variable and where it is available.
 *
 *		this keyword can be in any line of the non_Static method
 */

//example to show the 'this' keyword.
public class This_Keyword {
	
	int age;
	String name;
	double salary;
	
	void details(int age, String name, double salary) 
	
	{
		
		this.age = age;
		this.name = name;
		this.salary = salary;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Keyword t = new This_Keyword();
		
		System.out.println("before going to 'this' keyword");
		//before going to this keyword
		System.out.println(t.age);
		System.out.println(t.name);
		System.out.println(t.salary+ "\n");
		
		
		
		//going to this keyword
		t.details(26,"Shiva", 49000.56);
		
		
		
		System.out.println("after 'this' keyword");
		//after this keyword
		System.out.println(t.age);
		System.out.println(t.name);
		System.out.println(t.salary);
		
	}

}
