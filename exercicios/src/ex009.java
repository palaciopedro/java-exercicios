import java.util.Scanner;

public class ex009 {
	
	public static void main(String[] args) {
		
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B) {
			if (A % B == 0) {
				System.out.println("They're multiples!");
			}
			else {
				System.out.println("They aren't multiples!");
			}
		}
		else {
			if (B % A == 0) {
				System.out.println("They're multiples!");
			}
			else {
				System.out.println("They aren't multiples!");
			}
		}
		
		sc.close();
	}
}
