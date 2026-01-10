import java.util.Scanner;

public class ex008 {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
		sc.close();
	}
}
