import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		
		double A, B, C;
		double tri, cir, trap, sqr, ret;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = A * C / 2;
		cir = 3.14159 * Math.pow(C, 2);
		trap = (A + B) * C / 2;
		sqr = Math.pow(B, 2);
		ret = A * B;
				
		System.out.printf("TRIANGLE: %.3f%n", tri);
		System.out.printf("CIRCLE: %.3f%n", cir);
		System.out.printf("TRAPEZE: %.3f%n", trap);
		System.out.printf("SQUARE: %.3f%n", sqr);
		System.out.printf("RETANGLE: %.3f%n", ret);
		
		sc.close();
	}
}
