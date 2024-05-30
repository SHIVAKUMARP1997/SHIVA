package java23_DateFunction;

import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {
		Date D = new Date();
		System.out.println(D);
		
		String dt = D.toString();
		
		System.out.println(dt);
		
		System.out.println(dt.substring(8,10)+ "-" + dt.substring(4, 7) +"-" +dt.substring(dt.length()-4));

		System.out.println(dt.substring(8,10)+ " " + dt.substring(4, 7) +" " +dt.substring(dt.length()-4));

		System.out.println(dt.substring(8,10)+ "/" + dt.substring(4, 7) +"/" +dt.substring(dt.length()-4));

		
		System.out.println("-------------------------------------------------------------------------");
		//epoch time
		
		System.out.println(D.getTime());
		
		//Converting epoch time.
		
		Date tday = new Date(D.getTime()+(60*60*1000*24));
		System.out.println(tday);
	}

}
