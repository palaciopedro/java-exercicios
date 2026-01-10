import java.util.Locale;
import java.util.Scanner;

public class ex004 {
	
	public static void main(String[] args) {
		
		int num, hours;
		double value, salary;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		hours = sc.nextInt();
		value = sc.nextDouble();
		
		salary = hours * value;
		
		System.out.println("Number = " + num);
		System.out.printf("Salary = $ %.2f", salary);
		
		sc.close();
	}
}
