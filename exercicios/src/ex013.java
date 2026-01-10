import java.util.Locale;
import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {
		
		double x, y;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0) {
			if (y == 0) {
				System.out.println("Origin");
			}
			else {
				System.out.println("X-axis");
			}
		}
		else if (x > 0) {
			if (y == 0) {
				System.out.println("Y-axis");
			}
			else if (y > 0) {
				System.out.println("Q1");
			}
			else {
				System.out.println("Q4");
			}
		}
		else {
			if (y == 0) {
				System.out.println("Y-axis");
			}
			else if (y > 0) {
				System.out.println("Q2");
			}
			else {
				System.out.println("Q3");
			}
		}
		
		sc.close();
	}
}
