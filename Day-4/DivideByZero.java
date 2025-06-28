package Task4;
import java.util.Scanner;
public class DivideByZero {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numerator:");
		int numerator = scanner.nextInt();
		
		System.out.println("Enter the denominator");
		int denominator = scanner.nextInt();
		
		try {
			int result = numerator/denominator;
			System.out.println("Result = "+ result);
			
		}catch(ArithmeticException e) {
			System.out.println("Error:cannot divide by zero");
		}
		
		

	}

}
