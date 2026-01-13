import java.util.Scanner;

public class ex015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int guess = sc.nextInt();
		int password = 2002;
		
		while (guess != password) {
			System.out.println("Invalid password");
			guess = sc.nextInt();
		}
		
		System.out.println("Access allowed");
		
		sc.close();
	}
}
