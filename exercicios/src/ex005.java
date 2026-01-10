import java.util.Locale;
import java.util.Scanner;

public class ex005 {
	
	public static void main(String[] args) {
		
		int c1, n1, c2, n2;
		double v1, v2, total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		c1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		total = n1 * v1 + n2 * v2; 
				
		System.out.printf("AMOUNT TO BE PAID FOR ITENS %d AND %d: $ %.2f",c1, c2, total);
		
		sc.close();
	}
}
