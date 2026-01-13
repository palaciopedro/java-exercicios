import java.util.Scanner;

public class ex022 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fact = 1;
		
		if (n != 0) {
			for (int i=0; i<n; i++) {
				fact *= n - i;
			}
		} else {
			fact = 1;
		}
		
		System.out.println(fact);
		
		sc.close();
	}
}
