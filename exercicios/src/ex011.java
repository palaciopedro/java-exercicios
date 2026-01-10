import java.util.Locale;
import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {
		
		int code, qnt;
		double price = 0;
		double total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		code = sc.nextInt();
		qnt =  sc.nextInt();
		
		if (code == 1) {
			price = 4.0;
		}
		else if (code == 2){
			price = 4.5;
		}
		else if (code == 3) {
			price = 5.0;
		}
		else if (code == 4) {
			price = 2.0;
		}
		else if (code == 5) {
			price = 1.5;
		}
		else {
			System.out.println("Invalid code!");
		}
		
		total = qnt * price;
		
		System.out.printf("Total: $ %.2f", total);
		
		sc.close();
	}
}
