package Assignment;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MKT_Sp_Assignment98 
{
	public static void main(String[] args) 
			{
				Scanner s1=new Scanner(System.in);
				System.out.println("Enter The String Value:");
				
				try
				{
					int number = s1.nextInt();
					String name[] = new String[number];
					name[0] = "ram";
					name[1] = "shyam";
					name[2] = "krishna";
					name[3] = "radha";
					System.out.println(Arrays.toString(name));
					System.out.println("there is no exception");
				}
				catch(InputMismatchException r1)
				{
					System.out.println("first exception come");
				}
				catch(ArrayIndexOutOfBoundsException r3)
				{
					System.out.println("third exception");
				}
				catch(ArithmeticException r2)
				{
					System.out.println("second exception come");
				}
	}

}
