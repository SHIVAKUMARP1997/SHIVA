package java24_Arrays;

public class Replace {

	public static void main(String[] args) {
		String str = "alisdughiosaudhg;ifsudba;vioubhfo123452175";
		
		//String.replace
		String strNew = str.replace('g', 'S');
		System.out.println(strNew);

		//String.replaceAll : to remove the alphabets or numbers from a give string 
		String strAll = str.replaceAll("[0-9]", "");
		System.out.println("after replaceAll : " + strAll);
		
		//
		
	}

}
