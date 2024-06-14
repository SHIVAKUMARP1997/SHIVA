package Assignment;
public class MKT_Sp_Assignment88 
{
	static double sum1 = 0;
	static double average = 0;
	public static void main(String[] args) {
		int no [] = new int[4];
		no[0] = 10;
		no[1] = 25;
		no[2] = 50;
		no[3] = 75;
		
		double no1 [] = new double[4];
		no1[0] = 10.356;
		no1[1] = 25.678;
		no1[2] = 50.4839;
		no1[3] = 75.479;
		
		for(int i =0; i<no.length; i++)	
		{
			sum1 = sum1 + no[i] + no1[i];
			average = sum1/(no.length + no1.length) ;
		}
		
		System.out.println("average of the two array is "+ average);
	}
}
