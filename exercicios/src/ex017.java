import java.util.Scanner;

public class ex017 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ethanol = 0;
		int gas = 0;
		int diesel = 0;
		int x = sc.nextInt();
		
		while (x != 4) {
			if (x == 1) {
				ethanol += 1;
			} else if (x == 2) {
				gas += 1;
			} else if (x == 3) {
				diesel += 1;
			}
			x = sc.nextInt();
		}
		
		System.out.println("Thank you!");
		System.out.println("Ethanol: " + ethanol);
		System.out.println("Gasoline: " + gas);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
