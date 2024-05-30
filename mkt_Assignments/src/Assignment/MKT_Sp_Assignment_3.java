package Assignment;
public class MKT_Sp_Assignment_3 {
	void add() {
		int a = 5;
		int b = 5;
		int sum = a+b;
		System.out.println("Non static method program " + sum); }
	void sub() {
		int a = 5;
		int b = 5;
		int sub = a-b;
		System.out.println(sub); }
	void mul() {
		int a = 5;
		int b = 5;
		int multiply = a*b;
		System.out.println(multiply); }
	void div() {
		int a = 5;
		int b = 5;
		int division = a/b;
		System.out.println(division); }
	void mod() {
		int a = 5;
		int b = 5;
		int Modu = a%b;
		System.out.println(Modu); }
	public static void main(String[] args) {
		MKT_Sp_Assignment_3 a1 = new MKT_Sp_Assignment_3();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod(); }}
