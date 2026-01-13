import java.util.Locale;
import java.util.Scanner;

public class ex020 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			
			double media = ((v1 * 2 + v2 * 3 + v3 * 5) / 10);
			
			System.out.printf("%.1f", media);
		}
		
		sc.close();
	}
}
