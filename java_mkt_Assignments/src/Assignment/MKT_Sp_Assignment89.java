package Assignment;
import java.util.Arrays;
public class MKT_Sp_Assignment89 
{
	static int countofDigit = 0;
	public static void main(String[] args) 
	{
		String name = "12ghf34";
		int a1 = name.length();
		System.out.println(a1);
		char[] c1 = name.toCharArray();
		System.out.println(c1);
		System.out.println(Arrays.toString(c1));
		
		for(int i =0; i< name.length(); i++)
		{
			boolean answer = Character.isDigit(c1[i]);
					if(answer == true) 
					{
						countofDigit++;
					}
		}
		System.out.println(countofDigit);
		if(countofDigit == a1)
		{
			System.out.println("string contains only digit");
		}
		else
		{
			System.out.println("string contains alpha and digit");
		}
	}
}
