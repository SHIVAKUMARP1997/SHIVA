package Assignment;
public class MKT_Sp_Assignment95
{
	static void add(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			assert arr [i] <= arr [i+1]; // assert keyword previous is less than next array
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args)
	{	
		int[] number = {5,4,3,2,1};  // not in asending order
		add(number);
	}
}
