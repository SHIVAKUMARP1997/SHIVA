package sel_Assignments;


//179) Automate https://grotechminds.com/registeration-form/   using DDT
public class Sel_Assignments179 {

	public static void main(String[] args) {
		int[] a1 = new int[] {2,5,7,9};
		int sum = 0;
		for (int i = 0; i<=a1.length-1; i++) {
			
			sum = a1[i]+sum;
		}
		double avg = sum/a1.length;
		System.out.println("the average of the values is: " +avg);
		
		
		

	}

}
