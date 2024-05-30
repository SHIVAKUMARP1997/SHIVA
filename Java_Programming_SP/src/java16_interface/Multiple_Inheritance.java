package java16_interface;
/*
 * we cannot achieve multiple level inheritance by using classes in java but .. 
 * we can do it by using interface concept.
 */

interface youtube{
	
	void watch();
	void pay();
}


interface google{
	void subscribe();
	void unsubscribe();
}

public class Multiple_Inheritance implements youtube,google //multiple inheritance
//with extends the above line is not possible .. it wont support multiple inheritance.
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subscribe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsubscribe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

}
