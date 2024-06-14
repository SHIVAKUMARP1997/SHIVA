package java21_Math_Random;



/*
 * Math_Random is having all the operation of mathematics by default.
 * 
 */

public class MathRandom {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		
		System.out.println(Math.addExact(1234, 4230));
		
		System.out.println(Math.addExact(55431344,567777777));
		
		System.out.println(Math.subtractExact(345, 6780));
		
		System.out.println(Math.sqrt(100));
		
		System.out.println(Math.max(34.6, 58.70));
		
		System.out.println(Math.min(46.57, 34.50));
		
		System.out.println(Math.random()); // it will give the random value between 0.0 to 1.0
		
		
		
		for (int i=0; i<11; i++)
		{
		double r = Math.random();
		double area = Math.PI * (r*r);
		System.out.println("Area Of a circle :" +i+ " :" +area );
		}

	}

}
