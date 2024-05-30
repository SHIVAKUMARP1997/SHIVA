package java29_Encapsulation;
class shiva{
	private int salary = 50000;
	
	private String Un = "Something";
	
	public String getUn() {
		return Un;
	}

	public void setUn(String un) {
		Un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private String pwd = "password";
	
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

public class Encap_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shiva up=new shiva();
		up.setSalary(70000);
		up.setUn("Shivakumar");
		up.setPwd("sensitive");
		System.out.println("Your updated name is : " +up.getUn()+ ". pwd is : " +up.getPwd()+ ". salary is : " +up.getSalary()); 
		

	}

}
