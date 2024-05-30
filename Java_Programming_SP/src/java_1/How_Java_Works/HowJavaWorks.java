package java_1.How_Java_Works;



/*
 * 1.How it works-- The Java.
 * 
 * 		In order to understand the working of java we need to know about JDK, JRE, JVM, JIT.
 * 
 * 		As we  all know operating system only understands binary language 0's and 1's.
 * where 1= true,  and 0= false. we need interpreter for that to happen but interpretation happens only if
 * there is JDK JRE JVM and JIT.
 * 
 * JDK : Java Development kit: will be having some library files, 
 * which will be required for some classes
 * 
 * JRE : Java Runtime Environment: In whichever java environment we want to run the java program,
 * should have the java installed in it called JRE.
 * 
 * JVM : Java Virtual Machine :JVM is the machine which executes the program by identifying the main method,
 * This part will be containing the interpreter and the compiler within.
 * 
 * JIT : Just In Time : Only responsible for converting the .class file into binary. 
 * 
 * 
 * UnderStandable.JavaFiles--> [COMPILER]-->.classFiles---->[INTERPRETER]-->binary--> OS--> Output.
 * 
 *   a. Compilation : Takes .java files as an input and checks for syntaxes and rules, 
 *   				  if there  is a mismatch in them it will throw an error called compile time error.
 *                    If the compilation gets passes it will converts the .java file into .class files,
 *                    followed by sending the .class files to interpreter. 
 *               .class files are the intermediate files neither understandable by system nor by human.
 *                     
 *   b. Interpretation : It reads line by line and helps us to execute the program.
 *   					 Also translates the .class files into the binary files. and then that binary 
 *   				-files are going as an input to the OS andOS will give output.
 *   				-->If there is an error in interpretation we will be getting Run_Time_Errors.
 *   				Every run time error leads to an exception.
 */

public class HowJavaWorks {
	public static void main(String[] args) {
		
		System.out.println("JDK, JRE, JVM, JIT, compiler and interpreter \nare the essencials to understand How java internally works");
	}

}
