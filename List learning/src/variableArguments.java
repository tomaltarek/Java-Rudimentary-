import java.util.Scanner;

/*@tomal tarek, arcola 
 * This program can average as many numbers as you wish to be
 * A method is defined that can take many arguments like printf function in C
 * 
 * 
 * 
 */
public class variableArguments {
	// below is the function that can take variable arguments, a is an array here 
	static double average(int ...a) {
		double total=0;  
		for (int i:a) {
			total=total+ i; 
		}
		return total/a.length; 
	}

public static void main(String []args) {
	double x=average(10,16,8); 
    
	
	System.out.println(x);
}

}
	