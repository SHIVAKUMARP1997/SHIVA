package java24_Arrays;

public class Presence_Of_Given_number {

	public static void main(String[] args) {
	int givenNumber = 45;
	String ret="NULL";
	
	
	int seq[]= new int[6];
	seq[0] = 145;	seq[1] = 445;	seq[2] = 645;	seq[3] = 75;	seq[4] = 450;	seq[5] = 495;
	
	for(int i = 0; i<seq.length; i++) {
		
						if(givenNumber == seq[i]) 
						{
							System.out.println("the number " +seq[i]+ " is present");
																	
								   }
						else {
							System.out.println("Present");
							}
		
					  }

			}
}
