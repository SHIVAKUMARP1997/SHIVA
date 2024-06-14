package Assignment;
import java.util.Scanner;
public class MKT_Sp_Assignment11 {
	static Scanner s1 = new Scanner(System.in);
	static void add() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a+b;
		System.out.println(sum); }
	static void sub() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sub = a-b;
		System.out.println(sub);}
	static void mul() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int multiply = a*b;
		System.out.println(multiply);}
	static void div() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int division = a/b;
		System.out.println(division);}
	static void mod() {
		int a = s1.nextInt();
		int b = s1.nextInt();
		int Modu = a%b;
		System.out.println(Modu);}
	public static void main(String[] args) {
		System.out.println("airthmatic operation using human input");
		add();
		sub();
		mul();
		div();
		mod();
	}}
