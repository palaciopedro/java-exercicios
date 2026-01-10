import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("NOT NEGATIVE");
		}
		else {
			System.out.println("NEGATIVE");
		}
		
		sc.close();
	}
}
