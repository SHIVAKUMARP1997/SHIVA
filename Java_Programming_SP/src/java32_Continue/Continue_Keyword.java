package java32_Continue;
/*
 * Continue is a keyword and is used to skip the perticular iteration in java.
 * 
 */
public class Continue_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			if(i==5) {
				continue;
			}
			System.out.println("My age is : "+i);
		}

	}

}
