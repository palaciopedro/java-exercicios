import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		
		double r, area;
		double pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextDouble();
		area = pi * Math.pow(r, 2);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}
}
