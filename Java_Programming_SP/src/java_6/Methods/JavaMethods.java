package java_6.Methods;

/*
 * 1.What are methods?
 * 	  Methods are the block of code to perform a particular task.
 * 
 * 	  Methods usually having 5 things in it....
 *    
 *    We cannot modify the syntax of the main method. it is fixed.
 *  	Compilation happens if there is a main method.
 * ----------------------------------------------------------------
 * Every methods will be having 5 things, 
 *      a. Access specifiers.
 *      b. Modifiers.
 *      c. return type.
 *      d. Method name.
 *      e. arguments.
 * --------------------------------------------------------
 * 2. Types of methods?
 *    
 *    a. Parameterized      |Ex: method();
 *    
 *    b. Non_Parameterized  |Ex: method(int a, int b);
 * 
 * ---------------------------------------------------------
 * 3. Static method.
 * 
 * 		Static methods are called by the method name inside of the main method.
 * 
 * 4.Non_Static method.
 * 		Non Static methods need object creation to call inside of the main method.
 * 
 * 5.How to create an Object: 
 * |ClassName Ref.Variable = new ClassName();|  OR |new ClassName();| 
 *  
 * 
 * 6. Method overloading.
 * 		Developing multiple methods with same name but different argument lists.
 * 
 * 
 * 7. Method Overriding.
 * 		Developing multiple methods with same name and same argument lists, 
 * but with different implementations.
 * 
 * 
 */		

public class JavaMethods {
	
    public static void add()//[accessSpecifier Modifier ReturnType MethodName(para/non_Para)]
	{
		int a = 100;
		int b= 200;
		int sum= a+b;
		System.out.println("Sum of the given number from a static method add() is : "+sum);
		
	}
	
    
	static void sub() //default, Static, void, methodName(non_Parameter)
	{
		int a = 100;
		int b= 00;
		int sub= a-b;
		System.out.println("result for the Static method sub() is : "+sub);
		
	}
	
	
	void mul()    //default, non_Static, void, methodName(non_Parameter)
	{
		int a = 100;
		int b= 200;
		int mul=a*b;
		System.out.println("result for the Non_Static method mul() is : "+mul);
		
	}
	
	
	static void div()
	{
		int a = 100;
		int b=200;
		int div= b/a;
		System.out.println(div);	
		
	}
	
	
	static void mod()
	{
		int a = 100;
		int b=200;
		int mod= b%a;
		System.out.println(mod);
		
	}
	
	
	//Method Overloading1
	public static void add(int q) //2nd method with same name with different parameter
	{
		
		System.out.println(" method Overloaded");
	}
	
	//Method Overloading2
	void mul(double n) //Non_Static 2nd method with same name but diff parameter.
	{
		
		System.out.println("Method Overloaded 2");
		
	}
	
	
	public static void main(String[] args) {
		add();   //static methods can be called inside the main method by calling the method name.
		
		JavaMethods j= new JavaMethods(); // Object creation for non_Static method.
		j.mul();  //calling non_Static method with object reference.

	}

}
