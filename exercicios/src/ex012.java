import java.util.Locale;
import java.util.Scanner;

public class ex012 {

	public static void main(String[] args) {
		
		double value;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		value = sc.nextDouble();
		
		if (value < 0 || value > 100) {
			System.out.println("Out of range");
		}
		else if (value >= 0 && value <= 25.0) {
			System.out.println("Range [0,25]");
		}
		else if (value <= 50.0) {
			System.out.println("Range (25,50]");
		}	
		else if (value <= 75.0) {
			System.out.println("Range (50,75]");
		}
		else {
			System.out.println("Range (75,100]");
		}
		
		sc.close();
	}
}
