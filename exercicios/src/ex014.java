import java.util.Locale;
import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		double tax = 0;
		
		if (salary > 2000) {
			if (salary > 4500) {
				tax = ((salary - 4500) * 0.28) + 350;
			}
			else if (salary > 3000) {
				tax = ((salary - 3000) * 0.18) + 80;
			}
			else {
				tax = (salary - 2000) * 0.08;	
			}
			System.out.printf("R$ %.2f", tax);
		}
		else {
			System.out.println("Tax free");
		}
			
		sc.close();
	}
}
