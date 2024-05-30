package java31_typeCasting;


/*
 * 1. Premitive typeCasting.
 * 
 * 			Converting One datatype into the another datatype is called as PrimitiveTypeCAsting.
 * 	
 * 		we have 2 types of Premitive typeCasting.......
 * 		
 * 		a. Narrowing typeCasting.
 * 				converting the bigger datatypes into the smaller.
 * 				can be done only by explicitly.
 * 
 * 
 * 		b. Widening typeCAsting.
 * 				Converting the smaller datatypes into bigger datatypes.
 * 				can be done both implicitly and explicitly.
 * 
 * 
 */
public class Premitive_typeCasting {

	public static void main(String[] args) {
		
		//Widening
		
		byte by=10;
		long lo = by;
		lo=100;
		
		
		
		int age=30;
		
		float fl = age;
		
		
		double upAge = age; // typecasting int became double #widening #implicitly
		System.out.println("i was int and i became double : " +upAge);
		
		double exp =(double) age; //#Explicitly widening
		System.out.println("\ni am updated explicitly: "+exp);
		
		// TODO Auto-generated method stub
		
		
		//Narrowing
		//Only explicit methods are allowed to narrowing Typecasting.
		double pi =3.142;
		
		int Np=(int) pi; // narrowing 
		System.out.println(Np);
	}

}
