package java_8.Conditional_Statements;

public class IF_Exam {

	public static void main(String[] args) {
		
		int [] numbers = {3,7,2,9,4};
	      
	      int sum =0;
	      
	      for(int i=0; i<numbers.length;i++)
	      {
	    	  if(numbers[i] % 2==0)
	    	 
	    	  {
	    		 sum = sum + numbers[i]; // sum = 2+4
	    
	    	  }
	      }
	        System.out.println(sum);	
				

	}

}
